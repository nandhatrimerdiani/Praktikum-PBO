// Nama : Nandha Trimerdiani Hidayat //
// NIM  : 24060122140167
// Tanggal   : 19 Maret 2023
// Deskripsi :

package org.main;

import org.mahasiswa.Mahasiswa;
import org.walimahasiswa.WaliMahasiswa;
import org.orang.Orang;

public class Main {
    public static void main(String[] args) {
        // objek dosen wali
        WaliMahasiswa wali1 = new WaliMahasiswa(
            "Nina",
            "12345677",
            "08765432189",
            "Yogyakarta");
        
        WaliMahasiswa wali2 = new WaliMahasiswa(
            "Susan",
            "12345688",
            "08765432189",
            "Yogyakarta");


        // objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa(
            "Budi R", 
            "32167895467999", 
            "24060122140999",
            "Informatika",
            wali1);

        Mahasiswa mahasiswa2 = new Mahasiswa(
            "Andi Affandi", 
            "32167895467908", 
            "24060122140888",
            "Kedokteran",
            wali2);

        mahasiswa1.cetak();
        System.out.println();
        mahasiswa2.cetak();
    }
}