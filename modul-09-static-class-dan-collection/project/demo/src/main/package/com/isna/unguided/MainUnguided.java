package com.isna.unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainUnguided {
    public static void main(String[] args) {
        List<ModelEksperimen> daftarModel = new ArrayList<>();
        daftarModel.add(new ModelEksperimen("Logistic Regression", 0.82, 12));
        daftarModel.add(new ModelEksperimen("Random Forest", 0.91, 45));
        daftarModel.add(new ModelEksperimen("SVM", 0.87, 60));
        daftarModel.add(new ModelEksperimen("KNN", 0.79, 5));
        daftarModel.add(new ModelEksperimen("Decision Tree", 0.84, 8));

        // 1. Jumlah eksperimen tercatat menggunakan static method
        System.out.println("Jumlah eksperimen: " + ModelEksperimen.getJumlahEksperimen());
        System.out.println();

        // 2. Sorting berdasarkan akurasi tertinggi ke terendah (Comparable)
        Collections.sort(daftarModel);
        System.out.println("Sorted by akurasi");
        daftarModel.forEach(System.out::println);
        System.out.println();

        // 3. Sorting berdasarkan waktu training tercepat (Comparator)
        Collections.sort(daftarModel, new WaktuTrainingComparator());
        System.out.println("Sorted by waktu training");
        daftarModel.forEach(System.out::println);
        System.out.println();

        // 4. Filtering model dengan akurasi minimal 0.85 menggunakan lambda
        System.out.println("Model dengan akurasi minimal 0.85");
        List<ModelEksperimen> filteredAkurasi = daftarModel.stream()
                .filter(m -> m.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        filteredAkurasi.forEach(System.out::println);
        System.out.println();

        // 5. Pencarian model dengan nama "KNN" menggunakan lambda
        System.out.println("Pencarian model KNN");
        ModelEksperimen hasilCari = daftarModel.stream()
                .filter(m -> m.getNamaModel().equalsIgnoreCase("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(hasilCari);
    }
}