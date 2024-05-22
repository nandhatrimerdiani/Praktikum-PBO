/*Nama        : Nandha Trimerdiani Hidayat
 NIM          : 24060122140167
 Tanggal      : 22-5-2024
 Deskripsi    : kelas serialisasi untuk menuliskan objek person*/
import java.io.*;
class person implements Serializable{
    private String name;
    public person (String n){
        name = n;
    }
    public  String getName(){
        return name;
    }
}

//class SerializePerson
public class SerializePerson{
    public static void main(String[] args){
        person person = new person("Panji");
        try{
            FileOutputStream f= new FileOutputStream("person.ser");
            ObjectOutputStream s= new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}