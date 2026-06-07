public class Diskon {
    // 1. ATRIBUT dibuat private (Encapsulation)
    private String namaPelanggan;
    private int persenDiskon;

    // 2. KONSTRUKTOR
    public Diskon(String namaPelanggan, int persenDiskon) {
        this.namaPelanggan = namaPelanggan;
        this.persenDiskon = persenDiskon;
    }

    // 3. GETTER
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public int getPersenDiskon() {
        return persenDiskon;
    }

    // 4. METHOD menghitung potongan harga
    public double hitungPotongan(double hargaAwal) {
        return hargaAwal * persenDiskon / 100;
    }

    public double hitungHargaSetelahDiskon(double hargaAwal) {
        return hargaAwal - hitungPotongan(hargaAwal);
    }

    // Method ini nanti bisa dioverride oleh child class
    public String getKeteranganBenefit() {
        return "Diskon reguler";
    }

    public void displayInfo() {
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Diskon         : " + persenDiskon + "%");
        System.out.println("Benefit        : " + getKeteranganBenefit());
    }
}