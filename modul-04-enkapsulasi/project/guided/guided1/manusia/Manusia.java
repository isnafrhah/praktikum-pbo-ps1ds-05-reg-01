package main.java.modul4.guided1.manusia;
public class Manusia {
    // Definisi atribut
    private String nama;
    private int umur;

    // Constructor
    public Manusia() {
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method setter
    public void setNama(String a) {
        nama = a;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
