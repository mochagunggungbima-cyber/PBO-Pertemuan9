public class Minuman extends MenuItem {
    private String ukuran; // "Kecil", "Sedang", "Jumbo"

    public Minuman(String nama, double hargaDasar, String ukuran) {
        super(nama, hargaDasar);
        this.ukuran = ukuran;
    }

    // Override abstract method
    @Override
    public double hitungTotalHarga() {
        double biayaTambahan = 0;
        if (ukuran.equalsIgnoreCase("Jumbo")) {
            biayaTambahan = 3000;
        } else if (ukuran.equalsIgnoreCase("Sedang")) {
            biayaTambahan = 1500;
        }
        return hargaDasar + biayaTambahan;
    }
}