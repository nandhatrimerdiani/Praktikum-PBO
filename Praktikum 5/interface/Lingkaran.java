// Nama     : Nandha Trimerdiani Hidayat
// NIM      : 24060122140167
// Tanggal  : 21 Maret 2024
// Deskripsi: Kelas impelementasi IArea berupa cara menghitung cara menghitung luas lingkaran

//Mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran (double r){
        jejari = r ;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}