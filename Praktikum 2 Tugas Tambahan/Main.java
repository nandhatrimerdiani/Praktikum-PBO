//Nama      : Nandha Trimerdiani Hidayat//
//NIM       : 24060122140167//
//Tanggal   : 3 Maret 2024//
//Deskripsi : Membuat aplikasi pemanggilan methid dari objek Mahasiswa dan WaliMahasiswa//

public class Main {

        public static void main(String[] args) {
                // Buat objek dosen
                WaliMahasiswa wali1 = new WaliMahasiswa(
                                "Irfan Afandi",
                                "0897654321",
                                "Jl.Baladewa No.18");

                WaliMahasiswa wali2 = new WaliMahasiswa(
                                "Eko",
                                "081234567",
                                "Jl.Baladewa No.20");

                // Objek Mahasiswa
                Mahasiswa mahasiswa1 = new Mahasiswa(
                                "Nandha",
                                "24060122140167",
                                "Informatika",
                                wali1);

                Mahasiswa mahasiswa2 = new Mahasiswa(
                                "Dayen",
                                "22161122140167",
                                "Kimia",
                                wali2);

                // Cetak informasi detail mahasiswa
                System.out.println();

                mahasiswa1.setNama("Dayen");
                System.out.println("Nama: " + mahasiswa1.getNama());
                System.out.println("Jurusan mahasiswa1: " + mahasiswa1.getJurusan());

                System.out.println();
                mahasiswa2.cetak();

        }
}
