/**
 * Nama      : Nandha Trimerdiani Hidayat
 * NIM       : 24060122140167
 * Tanggal   : 1 juni 2024
 * Deskripsi : Kelas Bird mengimplementasikan antarmuka IFlyer dan metode dari kelas abstrak Animal, dengan metode untuk terbang, makan, lepas landas, dan mendarat.
 */

 public class Bird extends Animal implements IFlyer {
    @Override
    public void takeOff() {
        System.out.println("Bird takes off");
    }

    @Override
    public void land() {
        System.out.println("Bird lands");
    }

    @Override
    public void fly() {
        System.out.println("I'm Bird");
        System.out.println("Bisa terbang");
    }

    @Override
    public void eat() {
        System.out.println("Makan: Makanan Burung");
    }
}