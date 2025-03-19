/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.entities;

/**
 *
 * @author HP
 */


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat dokter
        Doctor doctor = new Doctor("dr. Naila", "Ortopedi");

        // Membuat pasien
        Patient patient = new Patient("Jessica", 31, "Skoliosis");

        // Membuat janji temu
        Appointment appointment = new Appointment(doctor, patient, new Date());

        // Menampilkan informasi
        System.out.println("Dokter: " + doctor.getName() + " - " + doctor.getSpecialization());
        System.out.println("Pasien: " + patient.getName() + " - Usia: " + patient.getAge());
        System.out.println("Diagnosis: " + patient.getDiagnosis());
        System.out.println("Janji Temu: " + appointment.getDate());
    }
}
