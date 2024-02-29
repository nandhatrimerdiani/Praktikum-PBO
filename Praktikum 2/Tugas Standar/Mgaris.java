//Nama      : Nandha Trimerdiani Hidayat//
//NIM       : 24060122140167//
//Tanggal   : 28 Februari 2024//
//Deskripsi : Class yang menampilkan program utama dari class Garis//

public class Mgaris {
    public static void main(String[] args) {
        Titik titikAwal = new Titik(2, 3);
        Titik titikAkhir = new Titik(5, 7);

        // membuat objek garis
        Garis garis = new Garis(titikAwal, titikAkhir);

        // menampilkan informasi tentang garis
        System.out.println("Informasi Garis: ");
        System.out.println(
                "Titik Awal: (" + garis.getTitikAwal().getAbsis() + ", " + garis.getTitikAwal().getOrdinat() + ")");
        System.out.println(
                "Titik Akhir: (" + garis.getTitikAkhir().getAbsis() + ", " + garis.getTitikAkhir().getOrdinat() + ")");
        System.out.println(" Panjang Garis: " + garis.getPanjang());
        System.out.println("Gradien Garis: " + garis.getGradien());

        // melakukan refleksi terhadap sumbu Y
        Garis garisRefleksiY = garis.getRefleksiY();
        System.out.println("Garis setelah Refleksi Y:");
        System.out.println("Titik Awal: (" + garisRefleksiY.getTitikAwal().getAbsis() + ", "
                + garisRefleksiY.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + garisRefleksiY.getTitikAkhir().getAbsis() + ", "
                + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");

        // membuat garis lain
        Titik titikAwalLain = new Titik(1, 1);
        Titik titikAkhirLain = new Titik(4, 1);
        Garis garisLain = new Garis(titikAwalLain, titikAkhirLain);

        // mengecek apakah garis awal tegak lurus dengan garis lain
        boolean tegakLurus = garis.isTegakLurus(garisLain);
        System.out.println("Apakah Garis awal tegak lurus dengan garis lain : " + tegakLurus);

        Garis g1 = new Garis(titikAkhir, titikAwal);
        System.out.println("Garis: (" + g1.getTitikAwal().getAbsis() + g1.getTitikAwal().getOrdinat() + ")" + "," + "("
                + g1.getTitikAkhir().getAbsis() + ", " + g1.getTitikAkhir().getOrdinat() + ")");
    }
}
