public class MTitik{
    public static void main(String[] args){
      Titik t1;
      Titik t2;
  
      t1 = new Titik();
      t2 = new Titik();
      t3 = new Titik(5,6);
  
      t1.setAbsis(1);
      t1.setOrdinat(2);
      t2.setAbsis(3);
      t2.setOrdinat(4);
  
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
      System.out.printf(format:"t2(%.1f, %.1f)\n", absis, ordinat);
      
    }
  }
