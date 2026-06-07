public class Rewards extends Diskon {
    private String hadiah;

    public Rewards(String namaPelanggan, int persenDiskon, String hadiah) {
        super(namaPelanggan, persenDiskon);
        this.hadiah = hadiah;
    }

    public boolean berhakReward() {
        return getPersenDiskon() >= 40;
    }

    @Override
    public String getKeteranganBenefit() {
        if (berhakReward()) {
            return "Mendapat hadiah spesial: " + hadiah;
        } else {
            return "Belum mendapatkan hadiah spesial";
        }
    }

    public void validateReward() {
        if (berhakReward()) {
            System.out.println("Pelanggan " + getNamaPelanggan() + " mendapatkan hadiah spesial: " + hadiah);
        } else {
            System.out.println("Pelanggan " + getNamaPelanggan() + " belum berhak mendapatkan hadiah.");
        }
    }
}