//Nama      : Nandha Trimerdiani Hidayat//
//NIM       : 24060122140167//
//Tanggal   : 28 Februari 2024//
//Deskripsi : Class yang menampilkan program utama dari class garis//

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static float counterGaris;

    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik();
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static float getCounterGaris() {
        return counterGaris;
    }

    public float getPanjang() {
        float deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        float deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public float getGradien() {
        float deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
          if (deltaX == 0){
            System.out.println("Garis vertikal, gradien tidak terdefinisi.");
            return Float.NaN;
          }
          return (float) ((titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis()));
    }
    public Garis getRefleksiY(){
        Titik titikAwalRefleksi = new Titik(-titikAwal.getAbsis(), -titikAwal.getOrdinat());
        Titik titikAkhirRefleksi = new Titik(-titikAkhir.getAbsis(), -titikAkhir.getOrdinat());
        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    }
    

    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

}

