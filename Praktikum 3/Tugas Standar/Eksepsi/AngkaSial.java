//Nama        : Nandha Trimerdiani H            //
//NIM         : 24060122140167                  //
//Tanggal     : Rabu, 6 Maret 2024              //
// Deskripsi  : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws' //

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Baris 12 (System.out.println(angka + "bukan angka sial");) tidak akan dieksekusi jika terjadi eksepsi pada pemanggilan as.cobaAngka(13);. 
//Baris 21 (System.out.println("hati-hati memasukkan angka!!!");) akan dieksekusi setelah blok catch ketika terjadi eksepsi, sehingga pesan tersebut akan ditampilkan//
