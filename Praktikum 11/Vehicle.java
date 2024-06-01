/**
 * Nama      : Nandha Trimerdiani Hidayat
 * NIM       : 24060122140167
 * Tanggal   : 1 Juni 2024
 * Deskrispi : Kelas abstrak Vehicle mendefinisikan metode abstrak calcFuelEfficiency dan calcTripDistance, serta mengoverride metode toString untuk mengembalikan nama sederhana kelas.
 */
public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}