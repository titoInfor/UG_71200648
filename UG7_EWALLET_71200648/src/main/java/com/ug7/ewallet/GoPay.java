package com.ug7.ewallet;

import java.util.Scanner;

import static com.ug7.ewallet.Main.formatRupiah;

public class GoPay extends eWallet {
    private int feeTopup = 1000;
    private int feeTransfer = 500;
    private int feeWithdraw = 2500;

    public GoPay(User user) {
        super(user);
    }

    public void topup(int jumlah) {
        if(jumlah < 10000) {
            System.out.println("minimal top up adalaj Rp10.000,00");
            return;
        }
        if(jumlah + feeTopup > super.getUser().getUang()) {
            jumlah += feeTopup;
            System.out.println("uang tidak cukup ("+formatRupiah(this.getSaldo()-jumlah)+")");
            return;
        }
        super.topup(jumlah);
        this.pay(feeTopup);
    }

    public void transfer(eWallet eWallet, int jumlah) {
        System.out.print("Masukkan PIN : ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.print("Validasi PIN");


        if(!password.equals(this.getUser().getPIN())) {
            System.out.println("PIN salah");
            return;
        }
        System.out.println("Transfer saldo akan terkena potongan fee " + formatRupiah(feeTransfer));
        System.out.print("Transfer sedang diproses");


        if(jumlah + feeTransfer > super.getSaldo()) {
            jumlah += feeTransfer;
            System.out.println("saldo tidak cukup ("+formatRupiah(this.getSaldo()-jumlah)+")");
            return;
        }
        super.transfer(eWallet, jumlah);
        this.pay(feeTransfer);
    }

    public void withdraw(int jumlah) {
        System.out.println("Withdraw saldo akan terkena potongan fee " + formatRupiah(feeWithdraw));
        if(jumlah + feeWithdraw > super.getSaldo()) {
            jumlah += feeWithdraw;
            System.out.println("saldo tidak cukup ("+formatRupiah(this.getSaldo()-jumlah)+")");
            return;
        }
        super.withdraw(jumlah);
        this.pay(feeWithdraw);
    }

    public void getInfo() {
        System.out.println("[GoPay e-Wallet]");
        super.getInfo();
    }

}
