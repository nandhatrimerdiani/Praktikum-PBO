/**
 * Nama      : Nandha Trimerdiani Hidayat
 * NIM       : 24060122140167
 * Tanggal   : 1 juni 2024
 * Deskripsi : Kelas abstrak Airplane mengimplementasikan metode takeOff dan land, serta mendeklarasikan metode abstrak fly.
 */
public abstract class Airplane extends Vehicle implements IFlyer {
    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " takes off");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " lands");
    }

    @Override
    public abstract void fly();
}