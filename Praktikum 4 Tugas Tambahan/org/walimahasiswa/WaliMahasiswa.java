// Nama : Nandha Trimerdiani Hidayat //
// NIM  : 24060122140167
// Tanggal   : 19 Maret 2023
// Deskripsi :

package org.walimahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang {
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat) {
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHP(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetak() {
        System.out.println("Nama Wali: " + getNama());
        System.out.println("NIK Wali: " + getNik());
        System.out.println("Nomor HP: " + nomorHp);
        System.out.println("Alamat: " + alamat);
    }
}