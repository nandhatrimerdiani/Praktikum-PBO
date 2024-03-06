//Nama        : Nandha Trimerdiani H            //
//NIM         : 24060122140167                  //
//Tanggal     : Rabu, 6 Maret 2024              //
// Deskripsi  : Program untuk demo asersi, yang akan menolka input jari-jari lingkaran yang bernilai nol//

class lingkaran {
    private double jariJari;

    public lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!";
        lingkaran l = new lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

//Inisialisasi variabel jariJari dengan nilai 0 yang akan menyebabkan asersi selalu gagal dikarenakan asersi jariJari > 0 //
