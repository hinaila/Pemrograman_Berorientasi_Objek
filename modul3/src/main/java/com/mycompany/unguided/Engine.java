/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author HP
 */

// File: Engine.java
// Kelas Engine merepresentasikan mesin mobil
public class Engine { // deklarasi class enginee
    private String type; // variabel untuk menyimpan jenis mesin
    private int horsepower; // variabel untuk menyimpan tenaga mesin

    // Konstruktor untuk menginisialisasi mesin
    public Engine(String type, int horsepower) {
        this.type = type; // inisialisasi jenis mesin
        this.horsepower = horsepower; // inisialisasi tenaga mesin
    }

    // Metode untuk mendapatkan jenis mesin
    public String getType() {
        return type; // mengembalikan nilai atribut horsepower
    }

    // Metode untuk mendapatkan tenaga mesin
    public int getHorsepower() {
        return horsepower;
    }
}