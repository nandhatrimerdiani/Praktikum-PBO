/**
 * Nama      : Nandha Trimerdiani Hidayat
 * NIM       : 24060122140167
 * Tanggal   : 1 Juni 2024
 * Deskrispi : Kelas Superman mengimplementasikan antarmuka IFlyer, mewarisi Kryptonian, dan mendefinisikan metode takeOff, land, fly, serta eat.
 */
public class Superman extends Kryptonian implements IFlyer {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public void takeOff() {
        System.out.println("Superman takes off");
    }

    @Override
    public void land() {
        System.out.println("Superman lands");
    }

    @Override
    public void fly() {
        System.out.println("I'm " + this.name);
    }

    @Override
    public void eat() {
        System.out.println("Makan: Nasi Goreng");
    }
}