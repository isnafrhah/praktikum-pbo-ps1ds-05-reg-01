package com.isna.modul07.guided.g2;

//Fondasi umum: belum punya peran spesifik, jadi tidak boleh diinstansiasi langsung
public abstract class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double earnings();

    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
