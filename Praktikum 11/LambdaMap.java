import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map untuk menyimpan NIM dan nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("001", "Adi");
        mahasiswaMap.put("002", "Bambang");
        mahasiswaMap.put("003", "Cici");
        mahasiswaMap.put("004", "Didi");

        // Menampilkan key dan value dari Map menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama: " + nama));
        }

}