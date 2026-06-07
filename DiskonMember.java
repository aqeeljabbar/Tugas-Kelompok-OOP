// Class DiskonMember merupakan turunan (subclass) dari class Diskon
public class DiskonMember extends Diskon {

    // Menyimpan level keanggotaan pelanggan (Silver, Gold, Platinum)
    private String levelMember;

    // Constructor untuk membuat objek DiskonMember
    public DiskonMember(String namaPelanggan, int persenDiskon, String levelMember) {

        // Memanggil constructor milik class induk (Diskon)
        // untuk mengisi nama pelanggan dan persen diskon dasar
        super(namaPelanggan, persenDiskon);

        // Mengisi atribut levelMember dengan nilai yang diberikan
        this.levelMember = levelMember;
    }

    // Method untuk menentukan tambahan diskon berdasarkan level member
    public int getTambahanDiskon() {

        // Jika level member Silver, mendapat tambahan diskon 5%
        if (levelMember.equalsIgnoreCase("Silver")) {
            return 5;

        // Jika level member Gold, mendapat tambahan diskon 10%
        } else if (levelMember.equalsIgnoreCase("Gold")) {
            return 10;

        // Jika level member Platinum, mendapat tambahan diskon 15%
        } else if (levelMember.equalsIgnoreCase("Platinum")) {
            return 15;

        // Jika level tidak dikenali, tidak mendapat tambahan diskon
        } else {
            return 0;
        }
    }

    // Override method hitungPotongan() dari class Diskon
    @Override
    public double hitungPotongan(double hargaAwal) {

        // Menghitung total diskon
        // (diskon dasar + diskon tambahan member)
        int totalDiskon = getPersenDiskon() + getTambahanDiskon();

        // Membatasi total diskon maksimal 100%
        if (totalDiskon > 100) {
            totalDiskon = 100;
        }

        // Menghitung jumlah potongan harga
        // Rumus: hargaAwal × totalDiskon / 100
        return hargaAwal * totalDiskon / 100;
    }

    // Override method getKeteranganBenefit() dari class Diskon
    @Override
    public String getKeteranganBenefit() {

        // Mengembalikan informasi benefit member
        return "Member " + levelMember +
               " mendapat tambahan diskon " +
               getTambahanDiskon() + "%";
    }

    // Getter untuk mengambil nilai levelMember
    public String getLevelMember() {
        return levelMember;
    }
}