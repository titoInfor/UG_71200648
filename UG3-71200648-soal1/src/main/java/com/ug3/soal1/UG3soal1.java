package com.ug3.soal1;

import java.util.Scanner;

public class UG3soal1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Makanan produkMakanan = new Makanan();

        System.out.println("========Data Product=========");
        System.out.println("Masukkan data product makanan anda");

        System.out.println("Nama Makanan :");
        produkMakanan.setNama(inp.nextLine());
        System.out.println("Tanggal kadaluarsa :");
        produkMakanan.setTanggalKadaluarsa(inp.nextLine());
        System.out.println("jumlah (quantity) :");
        produkMakanan.setKuantity(inp.nextInt());
        System.out.println("Berat (gram) :");
        produkMakanan.setBerat(inp.nextInt());

        System.out.println("========Data Product=========");
        System.out.println("Nama makanan ="+produkMakanan.getNama());
        System.out.println("Tanggal kadaluarsa ="+produkMakanan.getTanggalKadaluarsa());
        System.out.println("Jumlah (quatity) ="+produkMakanan.getKuantity());
        System.out.println("berat ="+produkMakanan.getBerat());


    }

}
