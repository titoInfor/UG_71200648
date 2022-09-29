package com.ug5b.soal1;

public class SmartCard {
    private String nama;
    private Long saldo;


    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }

    public Long getSaldo() {
        return saldo;
    }
    public void topUp(Voucher vch){
        if (vch.getKode() == "VC"){
            System.out.println("Top up gagal");
        }else {
            saldo += Long.parseLong(vch.getKode().substring(2));
            System.out.println("Kode Voucher: "+vch.getKode()+ "Top up sukses!");}
    }

}
