package com.isna.guided.g3;

public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[1];

            System.out.println(arr[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: HANDLE EXCEPTION
            System.out.println("Terjadi eksepsi karena index tidak valid");
        }

        System.out.println("Program selesai");
    }
}