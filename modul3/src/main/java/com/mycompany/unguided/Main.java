/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author HP
 */

// File: Main.java
// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek mesin
        Engine engine = new Engine("V8", 450);

        // Membuat objek transmisi
        Transmission transmission = new Transmission("Automatic");

        // Membuat objek mobil dengan mesin dan transmisi yang telah dibuat
        Car car = new Car("Ford Mustang", engine, transmission);
        
        // Menampilkan informasi mobil
        car.displayCarInfo();
    }
}
