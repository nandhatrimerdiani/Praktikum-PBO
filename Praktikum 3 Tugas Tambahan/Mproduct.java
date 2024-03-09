public class Mproduct {

    public static void main(String[] args) {
        Product product = new Product("Laptop", 4, 500);

        // Menampilkan informasi produk sebelum pembelian
        System.out.println("Product Name: " + product.getNama());
        System.out.println("Product Stock: " + product.getStock());
        System.out.println("Product price: " + product.getPrice());

        // Membeli 5 unit product
        product.purchaseProduct(5);

        // Menampilkan informasi produk setelah pembelian
        // System.out.println("Product Stock: " + product.getStock());
    }
}