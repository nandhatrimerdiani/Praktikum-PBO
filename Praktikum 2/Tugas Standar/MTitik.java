//Nama      : Nandha Trimerdiani Hidayat//
//NIM       : 24060122140167//
//Tanggal   : 28 Februari 2024//
//Deskripsi : Class yang menampilkan program utama dari class Titik//

public class MTitik{
    public static void main(String[] args){
      Titik t1;
      Titik t2;
      Titik t3;
  
      t1 = new Titik();
      t2 = new Titik();
      t3 = new Titik();
  
      t1.setAbsis(5);
      t1.setOrdinat(7);
      t2.setAbsis(5);
      t2.setOrdinat(7);
      t3.setAbsis(5);
      t3.setOrdinat(6);
  
      float counterTitik;
      float absis;
      float ordinat;
  
      counterTitik = Titik.getCounterTitik();
      System.out.println("Jumlah objek titik: " + counterTitik);
  
      absis = t1.getAbsis();
      ordinat = t1.getOrdinat();
      System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
  
      absis = t2.getAbsis();
      ordinat = t2.getOrdinat();
      System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);

      System.out.println("Jarak titik t1 terhadap titik pusat = " + t1.getJarakPusat());

      t1.refleksiX();
      t2.refleksiY();
      System.out.println("Titik sekarang :  (" + t3.getAbsis() + "," + t3.getOrdinat() + ")");

      Titik t4 = t2.getRefleksiX();
      System.out.println("Refleksi x : (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
      Titik t5 = t2.getRefleksiY();
      System.out.println("Refleksi y : (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")"); 

      
    }
  }

  //Kesimpulan//
  //Dari hasil percobaan dapat disimpulkan bahwa enkapsulasi membantu kita mengendalikan cara kita mengakses dan memanipulasi//
  //data dalam suatu objek. dengan menggunakan fitur seperti privat dan public, kita dapat menjaga keamanan data dan menghindari//
  //perubahan yang tidak diinginkan. Enkapsulasi juga membuat lebih mudah untuk membuat dan memodifikasi bagian-bagian dalam program//
  //tanpa merusak bagian-bagian lainnya. Jadi, enkapsulasi membantu kita membuat code lebih teratur, mudah dijaga dan dapat diandalkan//