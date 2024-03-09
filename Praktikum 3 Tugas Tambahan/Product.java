//Nama        : Nandha Trimerdiani H            //
//NIM         : 24060122140167                  //
//Tanggal     : 7 Maret 2024                    //
// Deskripsi  : Asersi//

public class Product {
    private String name;
    private int stock;
    private int price;

    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;

    }

    public String getNama() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        assert !name.isEmpty() : "Nama tidak boleh kosong";
        this.name = name;
    }

    public void setStock(int stock) {
        assert stock >= 0 : "Stock tidak boleh bernilai negatif";
        this.stock = stock;
    }

    public void setPrice(int price) {
        assert price >= 0 : "Harga tidak boleh bernilai negatif";
        this.price = price;
    }

    public void purchaseProduct(int quantity) {
        assert quantity > 0 : "Quantity harus bernilai positif";
        int availableQuality = Math.min(quantity, stock);
        stock -= availableQuality;

    }

    public void addStock(int quantity) {
        assert quantity > 0 : "Quantity harus bernilai positif";
        stock += quantity;
    }

}
