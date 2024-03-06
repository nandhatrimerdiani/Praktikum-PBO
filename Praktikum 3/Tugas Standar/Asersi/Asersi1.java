//Nama        : Nandha Trimerdiani H            //
//NIM         : 24060122140167                  //
//Tanggal     : Rabu, 6 Maret 2024              //
// Deskripsi  : Program untuk menunjukan asersi //

class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println(" bilangan negatif");
        }
    }

}