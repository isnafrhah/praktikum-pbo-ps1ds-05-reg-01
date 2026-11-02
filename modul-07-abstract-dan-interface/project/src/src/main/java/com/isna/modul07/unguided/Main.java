package com.isna.modul07.unguided;

public class Main {
    public static void main(String[] args) {
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        TiketReguler tiketReg = new TiketReguler("Interstellar", 40000.0, 2, 3);
        TiketVIP tiketVip = new TiketVIP("Dune: Part Two", 60000.0, 2, 25000.0);
        PaketSnack snack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000.0);

        ItemTransaksi[] daftarBelanja = new ItemTransaksi[] {
            tiketReg,
            tiketVip,
            snack
        };

        double totalTransaksi = 0.0;

        for (ItemTransaksi item : daftarBelanja) {
            item.cetakRincianItem();
            totalTransaksi += item.getNominalBayar();
        }

        System.out.println("TOTAL TRANSAKSI : Rp" + totalTransaksi);
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}