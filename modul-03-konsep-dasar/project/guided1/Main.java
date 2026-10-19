public class Main {
    public static void main(String[] args) {

        MahasLaporanDataset;
import laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {

        // Dataset 1: constructor tanpa parameter
        LaporanDataset dataset1 = new LaporanDataset();
        dataset1.setNama("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        // Dataset 2: constructor dengan parameter nama
        LaporanDataset dataset2 = new LaporanDataset("Wine Quality");

        // Dataset 3: constructor dengan semua parameter
        LaporanDataset dataset3 = new LaporanDataset("Iris", 150, 5, 0);

        // Menyimpan dataset dalam array
        LaporanDataset[] daftarDataset = {
            dataset1,
            dataset2,
            dataset3
        };

        // Membuat objek laporan
        LaporanDataset laporan = new LaporanDataset();

        // Mencetak laporan semua dataset
        for (LaporanDataset dataset : daftarDataset) {
            laporan.cetak(dataset);
        }

        // Menampilkan jumlah objek dataset
        System.out.println(
            "Total dataset dibuat : " + LaporanDataset