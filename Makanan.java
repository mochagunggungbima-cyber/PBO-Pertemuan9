public class Makanan extends MenuItem {
    private int porsi;

    public Makanan(String nama, double hargaDasar, int porsi) {
        super(nama, hargaDasar);
        this.porsi = porsi;
    }

    // Override abstract method
    @Override
    public double hitungTotalHarga() {
        // Total = (harga dasar * porsi) + pajak 10%
        double total = hargaDasar * porsi;
        double pajak = total * 0.10;
        return total + pajak;
    }
}