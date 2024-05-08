// Nama : Nandha Trimerdiani Hidayat
// NIM  : 24060122140167
// Tanggal : 8 Mei 2024
//Deskripsi: File utama dari program yang mendemonstrasikan penggunaan kelas-kelas yang telah didefinisikan, termasuk membuat objek Ulat, objek Data<Kupu>, dan menggunakan metode untuk mengatur dan mengakses isi data dengan tipe Kupu.

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();

        Data<Kupu> anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
