package unguided;

public class ModelKlasifikasi extends Model {
    private int jumlahKelas;

    public ModelKlasifikasi(String namaModel, int jumlahDataLatih,
            int jumlahKelas) {
        super(namaModel, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah kelas: " + this.jumlahKelas);
    }

    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() * this.jumlahKelas;
    }
}
