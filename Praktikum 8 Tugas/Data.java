// Nama : Nandha Trimerdiani Hidayat
// NIM  : 24060122140167
// Tanggal : 8 Mei 2024
//Deskripsi: Mendefinisikan kelas generik Data<T> yang memiliki properti isi dengan tipe generik T dan metode untuk mengambil dan mengatur isi data.

class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }

}
