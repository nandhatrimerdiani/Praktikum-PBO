//Nama      : Nandha Trimerdiani Hidayat//
//NIM       : 24060122140167//
//Tanggal   : 28 Februari 2024//
//Deskripsi : Class yang menampilkan program utama dari class Titik//

public class Titik {
  private float absis;
  private float ordinat;
  private static float counterTitik;

  public Titik() {
    absis = 0;
    ordinat = 0;
    counterTitik++;
  }

  public Titik(float absis, float ordinat) {
    this.absis = absis;
    this.ordinat = ordinat;
    // this.counterTitik++;
  }

  public void setAbsis(float a) {
    absis = a;
  }

  public void setOrdinat(float o) {
    ordinat = o;
  }

  public float getAbsis() {
    return absis;
  }

  public float getOrdinat() {
    return ordinat;
  }

  public static float getCounterTitik() {
    return counterTitik;
  }

  public float getJarakPusat() {
    return (float) Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
  }

  public void refleksiX() {
    this.ordinat = -(this.ordinat);
  }

  public void refleksiY() {
    this.absis = this.absis * (-1);

  }

  public Titik getRefleksiX() {
    return new Titik(this.absis, -(this.ordinat));
  }

  public Titik getRefleksiY() {
    // Titik t = new Titik(-(this.absis), this ordinat);
    return new Titik(-this.absis, (this.ordinat));

  }

}

// Kesimpulan//
// Dari hasil percobaan dapat disimpulkan bahwa enkapsulasi membantu kita
// mengendalikan cara kita mengakses dan memanipulasi//
// data dalam suatu objek. dengan menggunakan fitur seperti privat dan public,
// kita dapat menjaga keamanan data dan menghindari//
// perubahan yang tidak diinginkan. Enkapsulasi juga membuat lebih mudah untuk
// membuat dan memodifikasi bagian-bagian dalam program//
// tanpa merusak bagian-bagian lainnya. Jadi, enkapsulasi membantu kita membuat
// code lebih teratur, mudah dijaga dan dapat diandalkan//