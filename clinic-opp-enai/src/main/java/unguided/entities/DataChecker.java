/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.entities;

/**
 *
 * @author HP
 */
//untuk mengecek validitas data sebelum digunakan, memastikan umur dalam batas wajar dan tidak ada nama kosong

public class DataChecker {
    public static boolean isValidAge(int age) { //metode untuk memeriksa apakah usia valid (range 0 -150)
        return age > 0 && age < 150;
    }

    public static boolean isValidName(String name) { //metode untuk memeriksa missing value (nama)
        return name != null && !name.trim().isEmpty();
    }
}
