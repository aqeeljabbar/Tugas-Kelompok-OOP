public class Transaksi {
    private String idTransaksi;
    private Diskon diskonPelanggan;
    private double hargaAwal;

    public Transaksi(String idTransaksi, Diskon diskonPelanggan, double hargaAwal) {
        this.idTransaksi = idTransaksi;
        this.diskonPelanggan = diskonPelanggan;
        this.hargaAwal = hargaAwal;
    }

    public Transaksi(String idTransaksi, Diskon diskonPelanggan) {
        this(idTransaksi, diskonPelanggan, 0);
    }

    public void cetakStruk() {
        double potongan = diskonPelanggan.hitungPotongan(hargaAwal);
        double hargaAkhir = hargaAwal - potongan;

        System.out.println("\n=================================");
        System.out.println("           STRUK TRANSAKSI        ");
        System.out.println("=================================");
        System.out.println("ID Transaksi   : " + idTransaksi);
        System.out.println("Nama Pelanggan : " + diskonPelanggan.getNamaPelanggan());
        System.out.println("Harga Awal     : Rp " + hargaAwal);
        System.out.println("Potongan       : Rp " + potongan);
        System.out.println("Harga Akhir    : Rp " + hargaAkhir);
        System.out.println("Benefit        : " + diskonPelanggan.getKeteranganBenefit());
        System.out.println("=================================");
    }
}