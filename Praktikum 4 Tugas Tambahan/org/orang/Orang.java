// Nama : Nandha Trimerdiani Hidayat //
// NIM  : 24060122140167
// Tanggal   : 19 Maret 2023
// Deskripsi :

package org.orang;

public class Orang {
    private String nama;
    private String nik;

    public Orang(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    public Orang(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void cetak() {
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
    }
}