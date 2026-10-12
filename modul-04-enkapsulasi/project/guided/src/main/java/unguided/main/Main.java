
package unguided.main;

import unguided.model.Dataset;
import unguided.laporan.LaporanDataset;

public class Main {

    public static void main(String[] args) {

        Dataset dataset1 = new Dataset();
        dataset1.setNamaDataset("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        Dataset dataset2 = new Dataset("Wine Quality");

        Dataset dataset3 = new Dataset("Iris", 150, 5, 0);

        Dataset[] daftarDataset = {
            dataset1,
            dataset2,
            dataset3
        };

        for (Dataset dataset : daftarDataset) {
            LaporanDataset laporan = new LaporanDataset(dataset);
            laporan.tampilkanLaporan();
        }

        System.out.println(
            "Total dataset dibuat : " + Dataset.getTotalDataset()
        );
    }
}
