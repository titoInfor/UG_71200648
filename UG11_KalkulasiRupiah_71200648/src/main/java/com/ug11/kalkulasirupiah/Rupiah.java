package com.ug11.kalkulasirupiah;

public class Rupiah {

    static String kalkulasi(String kalimat){
        String[] temp = kalimat.split(" ");
        int hasil = 0;
        String coba = " ";
        int hitung = 0;
        System.out.print("Rincian biaya: ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].matches("[R&p]+[0-9]+[.][0-9]+[,][0-9]+")){
                System.out.print(temp[i] + coba);


            }
        }
        return coba;
    }

    public static void main(String[] args) {
        String inp ="Ibu membeli minyak goreng seharga Rp22.500,00 dan margarin seharga Rp12.500,00 di" + "supermarket";

        System.out.println(kalkulasi(inp));
    }
}
