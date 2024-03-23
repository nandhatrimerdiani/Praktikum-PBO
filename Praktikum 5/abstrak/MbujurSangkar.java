// Nama     : Nandha Trimerdiani Hidayat
// NIM      : 24060122140167
// Tanggal  : 21 Maret 2024
// Deskripsi: Kelas yang mengimplementasikan cara menghitung luas bujur sangkar

import java.util.Scanner;

public class MbujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + "satuan adalah " + bs.hitungLuas(sisi));

        scan.close();
    }

}