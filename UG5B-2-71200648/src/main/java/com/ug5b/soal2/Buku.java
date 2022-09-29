package com.ug5b.soal2;

public class Buku {
    private String kode;
    private static int nextNum=1;
    private String judul;
    private String penulis;
    private long harga;
    private int stok;

    public Buku(String argJudul,String argPenulis,long argHarga,int argStok){
        judul =argJudul;
        penulis=argPenulis;
        harga=argHarga;
        stok =argStok;
        kode = "NV24510"+nextNum;
        nextNum +=1;

    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
