package com.isna.guided.g5;

public class DemoException {
    public static void main(String[] args) {
        Coba c = new Coba();

        try {
            c.tampil();
        } catch (Exception e) {
            //TODO handle exception
            System.out.println(e.getMessage());
            System.out.println("Program selesai");
        }
    }
}