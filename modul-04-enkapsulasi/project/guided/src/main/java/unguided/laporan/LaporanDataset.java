
package unguided.laporan;

import java.util.Locale;
import unguided.model.Dataset;

public class LaporanDataset {

    private Dataset dataset;

    public LaporanDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    public void tampilkanLaporan() {
        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + dataset.getNamaDataset());
        System.out.println("Jumlah Baris : " + dataset.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + dataset.getJumlahKolom());

        System.out.printf(
            Locale.US,
            "Missing      : %d sel (%.2f%%)%n",
            dataset.getJumlahMissing(),
            dataset.getPersentaseMissing()
        );

        if (dataset.perluDibersihkan()) {
            System.out.println("Status       : Perlu dibersihkan");
        } else {
            System.out.println("Status       : Bersih");
        }

        System.out.println();
    }
}
