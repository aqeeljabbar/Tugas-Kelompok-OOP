public class Main {
    public static void main(String[] args) {

        // 1. Membuat objek dari class Diskon biasa
        Diskon p1 = new Diskon("Aqeel", 52);
        Diskon p2 = new Diskon("Rofii", 40);
        Diskon p3 = new Diskon("Abdul", 31);

        // 2. Membuat objek dari class Rewards
        Rewards p4 = new Rewards("Delita", 45, "Voucher Makan Gratis");

        // 3. Membuat objek dari class DiskonMember
        DiskonMember p5 = new DiskonMember("Riyana", 6, "Gold");

        // 4. Polymorphism
        // Array bertipe Diskon bisa menampung Diskon, Rewards, dan DiskonMember
        Diskon[] daftarPelanggan = {p1, p2, p3, p4, p5};

        System.out.println("=== DATA PELANGGAN DISKON ===");

        for (Diskon pelanggan : daftarPelanggan) {
            pelanggan.displayInfo();
            System.out.println("-----------------------------");
        }

        // 5. Menampilkan pelanggan dengan diskon >= 20%
        System.out.println("\n=== Pelanggan dengan Diskon >= 20% ===");

        for (Diskon pelanggan : daftarPelanggan) {
            if (pelanggan.getPersenDiskon() >= 20) {
                System.out.println(pelanggan.getNamaPelanggan() + " mendapat diskon " + pelanggan.getPersenDiskon() + "%");
            }
        }

        // 6. Validasi reward khusus
        System.out.println("\n=== Validasi Hadiah Spesial ===");
        p4.validateReward();

        // 7. Simulasi transaksi
        System.out.println("\n=== SIMULASI TRANSAKSI ===");

        Transaksi t1 = new Transaksi("TRX001", p1, 100000);
        Transaksi t2 = new Transaksi("TRX002", p4, 100000);
        Transaksi t3 = new Transaksi("TRX003", p5, 100000);

        t1.cetakStruk();
        t2.cetakStruk();
        t3.cetakStruk();
    }
}