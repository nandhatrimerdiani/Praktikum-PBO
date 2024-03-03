//Nama      : Nandha Trimerdiani Hidayat//
//NIM       : 24060122140167//
//Tanggal   : 3 Maret 2024//
//Deskripsi : Membuat aplikasi pemanggilan methid dari objek Mahasiswa dan WaliMahasiswa//

public class Mahasiswa {

    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public WaliMahasiswa getWali() {
        return wali;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa Wali) {
        this.wali = wali;
    }

    public void cetak() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Nama Wali: " + wali.getNama());
        System.out.println("Nomor HP Wali: " + wali.getNomorHP());
        System.out.println("Alamat Wali: " + wali.getAlamat());
    }

}
