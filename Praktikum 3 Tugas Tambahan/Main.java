public class Main {
    public static void main(String[] args) {

        // Instansiasi objek buku
        Buku buku1 = new Buku("Laut Bercerita");
        Buku buku2 = new Buku("Hello");
        Buku buku3 = new Buku("Sebuah Seni Untuk Bersikap Bodo Amat");
        Buku buku4 = new Buku("Sapiens");

        // Instansiasi objek anggota
        Anggota anggota1 = new Anggota("Fitray");
        Anggota anggota2 = new Anggota("Dayen");
        Anggota anggota3 = new Anggota("Nana");

        try {
            // Menambahkan anggota di dalam blok try
            anggota1.pinjamanBuku(buku1);
            anggota1.pinjamanBuku(buku2);
            anggota1.pinjamanBuku(buku1);

            anggota1.pinjamanBuku(new Buku("Java Programming"));
            anggota3.pinjamanBuku(new Buku("Bumi Manusia"));

        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
