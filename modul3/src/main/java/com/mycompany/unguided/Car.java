/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author HP
 */

// File: Car.java
// Kelas Car yang memiliki hubungan dengan Engine dan Transmission
public class Car {
    private String brand; // variabel untuk merk mobil
    private Engine engine; // variabel untuk menyimpan objek engine
    private Transmission transmission; // variabel untuk menyimpan objek transmission
    
    // Konstruktor untuk menginisialisasi mobil beserta komponennya
    public Car(String brand, Engine engine, Transmission transmission) {
        this.brand = brand; // inisialisasi merk mobil
        this.engine = engine; // inisisalisasi mesin mobil dengan objek engine
        this.transmission = transmission; // inisialisasi transmisi mobil dengan objek transmission
    }

    // Metode untuk menampilkan informasi mobil
    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Mesin: " + engine.getType() + " dengan tenaga " + engine.getHorsepower() + " HP");
        System.out.println("Transmisi: " + transmission.getType());
    }
}
