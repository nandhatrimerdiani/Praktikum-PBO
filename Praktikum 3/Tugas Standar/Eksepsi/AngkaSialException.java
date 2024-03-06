//Nama        : Nandha Trimerdiani H            //
//NIM         : 24060122140167                  //
//Tanggal     : Rabu, 6 Maret 2024              //
// Deskripsi  : Eksepsi buatan sendiri, menolak masukan angka 13! //

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!");
    }
}