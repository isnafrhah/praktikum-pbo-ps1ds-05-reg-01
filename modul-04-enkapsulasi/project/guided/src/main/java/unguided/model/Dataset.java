
package unguided.model;

public class Dataset {

    private String namaDataset;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    public static final double BATAS_MISSING = 5.0;

    private static int totalDataset = 0;

    private boolean barisSudahDiisi = false;
    private boolean kolomSudahDiisi = false;
    private boolean missingSudahDiisi = false;

    public Dataset() {
        totalDataset++;
    }

    public Dataset(String namaDataset) {
        this.namaDataset = namaDataset;
        totalDataset++;
    }

    public Dataset(String namaDataset, int jumlahBaris,
                   int jumlahKolom, int jumlahMissing) {
        this.namaDataset = namaDataset;
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahMissing = jumlahMissing;

        barisSudahDiisi = true;
        kolomSudahDiisi = true;
        missingSudahDiisi = true;

        totalDataset++;
    }

    public String getNamaDataset() {
        return namaDataset;
    }

    public void setNamaDataset(String namaDataset) {
        this.namaDataset = namaDataset;
    }

    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public void setJumlahBaris(int jumlahBaris) {
        if (!barisSudahDiisi && jumlahBaris >= 0) {
            this.jumlahBaris = jumlahBaris;
            barisSudahDiisi = true;
        }
    }

    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public void setJumlahKolom(int jumlahKolom) {
        if (!kolomSudahDiisi && jumlahKolom >= 0) {
            this.jumlahKolom = jumlahKolom;
            kolomSudahDiisi = true;
        }
    }

    public int getJumlahMissing() {
        return jumlahMissing;
    }

    public void setJumlahMissing(int jumlahMissing) {
        if (!missingSudahDiisi && jumlahMissing >= 0) {
            this.jumlahMissing = jumlahMissing;
            missingSudahDiisi = true;
        }
    }

    public double getPersentaseMissing() {
        long totalSel = (long) jumlahBaris * jumlahKolom;

        if (totalSel == 0) {
            return 0.0;
        }

        return (double) jumlahMissing / totalSel * 100;
    }

    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }

    public static int getTotalDataset() {
        return totalDataset;
    }
}
