/*Nama        : Nandha Trimerdiani Hidayat
 NIM          : 24060122140167
 Tanggal      : 22-5-2024
 Deskripsi    : kelas serialisasi untuk menuliskan objek person*/
import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (person) s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
