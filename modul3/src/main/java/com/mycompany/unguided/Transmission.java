/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author HP
 */

// File: Transmission.java
// Kelas Transmission merepresentasikan sistem transmisi mobil
public class Transmission {
    private String type; // variabel untuk menyimpan jenis transmisi

    // Konstruktor untuk menginisialisasi transmisi
    public Transmission(String type) { // inisialisasi atribut type dengan nilai dari parameter type
        this.type = type;
    }

    // Metode untuk mendapatkan jenis transmisi
    public String getType() {
        return type; //mengembalikan nilai atribut type 
    }
}