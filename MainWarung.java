public class MainWarung {
    public static void main(String[] args) {
        // Objek dari Subclass Makanan dan Minuman
        MenuItem makanan1 = new Makanan("Nasi Goreng Spesial", 15000, 2);
        MenuItem minuman1 = new Minuman("Es Teh Manis", 4000, "Jumbo");

        // Memanggil concrete method cetakNota()
        System.out.println("--- NOTA WARUNG ---");
        makanan1.cetakNota();
        minuman1.cetakNota();
    }
}