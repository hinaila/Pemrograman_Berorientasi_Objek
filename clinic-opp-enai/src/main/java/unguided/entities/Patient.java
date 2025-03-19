/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.entities;

/**
 *
 * @author HP
 */
//enkapsulasi diterapkan dengan membuat atribut private dan menyediakan getter
//tiap kali objek pasien dibuat, jumlah diagnosis akan bertambah

public class Patient {
    private String name;
    private int age;
    private String diagnosis;
    private static int diagnosisCount = 0;

    //konstruktor untuk inisialisasi pasien baru
    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        diagnosisCount++;
    }

    //getter nama pasien
    public String getName() {
        return name;
    }

    //getter umur pasien
    public int getAge() {
        return age;
    }

    //getter diagnosis penyakit yg dialami pasien
    public String getDiagnosis() {
        return diagnosis;
    }

    //getter untuk jumlah total diagnosis yg telah dibuat
    public static int getDiagnosisCount() {
        return diagnosisCount;
    }
}

