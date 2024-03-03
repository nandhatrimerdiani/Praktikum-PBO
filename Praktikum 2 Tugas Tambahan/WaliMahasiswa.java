//Nama      : Nandha Trimerdiani Hidayat//
//NIM       : 24060122140167//
//Tanggal   : 3 Maret 2024//
//Deskripsi : Membuat aplikasi pemanggilan methid dari objek Mahasiswa dan WaliMahasiswa//

public class WaliMahasiswa {

    private String nama;
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nomorHp, String alamat) {
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorHP() {
        return nomorHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}