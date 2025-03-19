/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.entities;

/**
 *
 * @author HP
 */
public class DataChecker {
    public static boolean isValidAge(int age) {
        return age > 0 && age < 150;
    }

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}
