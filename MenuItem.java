public abstract class MenuItem {
    protected String nama;
    protected double hargaDasar;

    public MenuItem(String nama, double hargaDasar) {
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    // Concrete Method (Sudah ada implementasinya)
    public void cetakNota() {
        System.out.println("================================");
        System.out.println("Item        : " + nama);
        System.out.println("Harga Dasar : Rp " + hargaDasar);
        System.out.println("Total Bayar : Rp " + hitungTotalHarga());
        System.out.println("================================");
    }

    // Abstract Method (Wajib di-override oleh Subclass)
    public abstract double hitungTotalHarga();
}