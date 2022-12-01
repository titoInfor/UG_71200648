package com.ug12.projectKassa;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {

    private HashMap<Produk,Integer> pesanan = new HashMap<Produk ,Integer>();
    private ArrayList<Kasir> arrKasir = new ArrayList<Kasir>();
    private Kasir kasir ;

    public Kassa() {
    }


    public void register (Kasir kasir){
        this.arrKasir.add(kasir);
        System.out.println("Kasir " + kasir.getNama() + " berhasil ditambahkan ke dalam sistem.");
    }
    public void tambahPesanan (Produk produk, int jumlah){
        pesanan.put(produk,jumlah);
    }
    public void printPenjualanKasir (){
        int helpNum = 1;
        System.out.println("Daftar Kasir:");
        System.out.println("No.\tNama\t\t\tTotal Penjualan");
        for (Kasir pegawai : arrKasir){
            System.out.println(helpNum + ".\t" + pegawai.getNama() + "\t\t\tRp." + pegawai.getTotalPenjualan());
            helpNum++;
        }
    }
    public void printNota (){
        int helpNum = 1;
        System.out.println("========Nota========");
        System.out.println("Kasir: " + this.kasir.getNama());
        System.out.println("No.\tNama Barang\t\t\tJumlah\t\tHarga\t\tSub total");
        for (Produk barang : pesanan.keySet()){
            System.out.println(helpNum + ".\t" + barang.getNama() + "\t\t\t" + pesanan.get(barang) + "\t\t" + barang.getHarga() + "\t\t" + (barang.getHarga() * pesanan.get(barang)));
            helpNum++;
            this.kasir.setTotalPenjualan((barang.getHarga() * pesanan.get(barang)));
        }
        pesanan.clear();
    }
    public void login(String username, String password){
        for (Kasir value : arrKasir) {
            if (value.getUsername().equals(username) && value.getPassword().equals(password)) {
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Username/password Anda salah!");
            }
            break;
        }
    }



}
