package com.isna.modul07.guided.g1;

//fondasi umum:belum punya peran spesifik, jadi tidak boleh diinstansiasi langsung
public abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //setiap pegawai pasti punya gaji, tapi rumusnya beda - beda
    public abstract double earnings();
}
