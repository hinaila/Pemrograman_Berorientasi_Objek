/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.entities;

/**
 *
 * @author HP
 */
public class Patient {
    private String name;
    private int age;
    private String diagnosis;
    private static int diagnosisCount = 0;

    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        diagnosisCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public static int getDiagnosisCount() {
        return diagnosisCount;
    }
}

