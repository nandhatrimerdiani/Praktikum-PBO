// Nama     : Nandha Trimerdiani Hidayat
// NIM      : 24060122140167
// Tanggal  : 23 Maret 2024
// Deskripsi: Kelas abstrak, berisi abstraksi bangun datar

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}