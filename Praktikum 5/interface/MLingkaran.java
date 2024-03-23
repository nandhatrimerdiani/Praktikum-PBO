// Nama     : Nandha Trimerdiani Hidayat
// NIM      : 24060122140167
// Tanggal  : 21 Maret 2024
// Deskripsi: implementasi cara menghitung luas lingkaran

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan1;
        double jejari;
        Lingkaran luas;

        scan1 = new Scanner(System.in);
        System.out.println("Masukan jejari lingkaran 1 : ");

        jejari = scan1.nextDouble();
        luas = new Lingkaran(jejari);

        System.out.println("Luas lingkaran 1 adalah " + luas.hitungLuas());

        scan1.close();
    }
}