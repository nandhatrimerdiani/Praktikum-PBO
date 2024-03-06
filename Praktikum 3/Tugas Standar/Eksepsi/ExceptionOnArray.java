//Nama        : Nandha Trimerdiani H            //
//NIM         : 24060122140167                  //
//Tanggal     : Rabu, 6 Maret 2024              //
// Deskripsi  :  program penggunaan eksepsi menggunakan class library java//

public class ExceptionOnArray {

    public static void main(String[] args) {
        // instansiasi objek array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;

        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();

        } finally {
            System.out.println("clean up code..");
        }
    }
}