// Nama : Nandha Trimerdiani Hidayat //
// NIM  : 24060122140167
// Tanggal   : 19 Maret 2023
// Deskripsi :

package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang {
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali) {
        super (nama,nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public WaliMahasiswa getWali() {
        return wali;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak() {
        super.cetak();
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        wali.cetak();
    }

}
