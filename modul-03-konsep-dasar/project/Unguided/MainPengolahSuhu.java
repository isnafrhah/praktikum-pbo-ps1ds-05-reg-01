public class MainPengolahSuhu {
    public static void main(String[] args) {

        double[] suhuHarian = {
            30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9
        };

        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("Data suhu awal:");
        pengolah.tampilkanData();

        System.out.println("\nIndex data kosong: " + pengolah.cariIndexKosong());

        pengolah.isiDataKosong();

        System.out.println("\nData suhu setelah diperbaiki:");
        pengolah.tampilkanData();

        System.out.println("\nRata-rata suhu: " + pengolah.hitungRataRata() + "°C");}
}   