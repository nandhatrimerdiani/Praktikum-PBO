/**
 * Nama      : Nandha Trimerdiani Hidayat
 * NIM       : 24060122140167
 * Tanggal   : 1 Juni 2024
 * Deskrispi : Membuat daftar objek yang dapat terbang, termasuk objek Bird dan Superman, dan memanggil metode fly dan eat pada setiap objek dalam daftar tersebut.
 */
import java.util.ArrayList;
import java.util.List;

public class ProgramEasy {
    public static void main(String[] args) {
        List<IFlyer> koleksiBisaTerbang = new ArrayList<>();

        IFlyer superman = new Superman("superman");
        IFlyer superboy = new Superman("superboy");
        IFlyer supergirl = new Superman("supergirl");
        IFlyer merpati = new Bird();
        IFlyer eagle = new Bird();

        koleksiBisaTerbang.add(merpati);
        koleksiBisaTerbang.add(eagle);
        koleksiBisaTerbang.add(superman);
        koleksiBisaTerbang.add(supergirl);
        koleksiBisaTerbang.add(superboy);

        for (IFlyer bisaTerbang : koleksiBisaTerbang) {
            if (bisaTerbang instanceof Superman) {
                Superman supermanObject = (Superman) bisaTerbang;
                supermanObject.fly();
                System.out.println("Bangsa: " + supermanObject.getClass().getSuperclass().getSimpleName());
                supermanObject.eat();
            } else {
                bisaTerbang.fly();
                ((Animal) bisaTerbang).eat();
            }
            System.out.println("");
        }
    }
}