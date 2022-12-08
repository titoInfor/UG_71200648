package com.ug13.sakitrumah;

public class Pengunjung {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit =2 ;
    private boolean status = false;

    public Pengunjung(String nama,int usia,String alamat,String penyakit){
        this.nama = nama;
        this.usia = usia;
        this.alamat= alamat;
        this.penyakit =penyakit;
    }

    public Pengunjung(String nama,int usia,String alamat){
        this.nama = nama;
        this.usia = usia;
        this.alamat =alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }




}
