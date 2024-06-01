/**
 * Nama      : Nandha Trimerdiani Hidayat
 * NIM       : 24060122140167
 * Tanggal   : 1 juni 2024
 * Deskripsi : Kelas abstrak Animal mendefinisikan metode abstrak eat dan mengoverride metode toString untuk mengembalikan nama sederhana kelas.
 */
public abstract class Animal {
    public abstract void eat();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}