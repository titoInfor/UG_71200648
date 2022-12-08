package com.ug13.sakitrumah;

import java.util.Scanner;

public class Pendaftaran {
    private String nama;


    public Pendaftaran(String nama){
        this.nama = nama;
    }
    public void mengaturJadwal(Jadwal jadwal, Pemeriksa pemeriksa, Pengunjung pengunjung) {
        if (!pengunjung.getStatus()) {
            jadwal.setPemeriksa(pemeriksa);
            jadwal.setPengunjung(pengunjung);
            jadwal.setStatusDaftar(true);
            jadwal.setPendaftaran(this);
        }
    }

    public static Pengunjung registrasi(){
            Scanner inp = new Scanner(System.in);
            System.out.print("Masukkan nama anda : ");
            String namaPengunjung = inp.nextLine();

            Scanner usia = new Scanner(System.in);
            System.out.print("Masukkan usia anda : ");
            int usiaPengunjung= inp.nextInt();

            Scanner inp2 = new Scanner(System.in);

            System.out.print("Masukkan alamat anda : ");
            String alamatPengunjung= inp2.nextLine();

            Scanner inp3 = new Scanner(System.in);
            System.out.print("Masukkan penyakit anda : ");
            String penyakitPengunjung = inp3.nextLine();

            Pengunjung pengunjung1 = new Pengunjung(namaPengunjung,usiaPengunjung,alamatPengunjung,penyakitPengunjung);
            System.out.println("Proses Registrasi Anda Berhasil!");
            return pengunjung1;
        }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
