package com.ug7.ewallet;

import static com.ug7.ewallet.Main.formatRupiah;

public class eWallet {
    private User user;
    private int saldo;

    public eWallet(User user) {
        this.user = new User(user.getNama(), user.getEmail(), user.getUang());
    }

    public void topup(int jumlah) {
        if(jumlah < 0) {
            System.out.println("Maaf, jumlah salah!");
            return;
        }
        if(this.user.getUang() < jumlah) {
            System.out.println(" uang tidak cukup ("+formatRupiah(this.user.getUang()-jumlah)+")");
            return;
        }
        this.user.topup(jumlah);
        this.saldo += jumlah;
        System.out.println( this.getUser().getNama() + "Top up saldo sebesar " + formatRupiah(jumlah) + " berhasil!");
    }

    public void pay(int jumlah) {
        if(jumlah < 0) {
            System.out.println("Maaf, jumlah salah!");
            return;
        }
        if(jumlah > this.saldo) {
            System.out.println("saldo tidak cukup ("+formatRupiah(this.saldo-jumlah)+")");
            return;
        }
        this.saldo -= jumlah;
    }

    public void transfer(eWallet eWallet, int jumlah) {
        if(jumlah < 0) {
            System.out.println("Maaf, jumlah salah!");
            return;
        }
        if(jumlah > this.saldo) {
            System.out.println("saldo tidak cukup ("+formatRupiah(this.saldo-jumlah)+")");
            return;
        }
        this.saldo -= jumlah;
        eWallet.terima(jumlah);
        System.out.println("Transfer saldo sejumlah " + formatRupiah(jumlah) + " ke akun " + eWallet.getUser().getNama() + " berhasil!");
    }

    private void terima(int jumlah) {
        if(jumlah < 0) {
            System.out.println("Maaf, jumlah salah!");
            return;
        }
        this.saldo += jumlah;
    }

    public void withdraw(int jumlah) {
        if(jumlah < 0) {
            System.out.println("Maaf, jumlah salah!");
            return;
        }
        if(jumlah > this.saldo) {
            System.out.println("saldo tidak cukup ("+formatRupiah(this.saldo-jumlah)+")");
            return;
        }
        this.saldo -= jumlah;
        this.user.withdraw(jumlah);
    }

    public User getUser() {
        return user;
    }

    public int getSaldo() {
        return saldo;
    }

    public void getInfo() {
        System.out.println("Nama: " + this.user.getNama() + " [PIN: " + this.user.getPIN() + "]");
        String email = "";
        if(this.user.isEmailConfirmed()) email = "[Confirmed]";
        System.out.println("Email: " + this.user.getEmail() + " " + email);
        System.out.println("Uang cash: " + formatRupiah(this.user.getUang()));
        System.out.println("Saldo e-wallet: " + formatRupiah(this.getSaldo()));
        System.out.println();
    }

}
