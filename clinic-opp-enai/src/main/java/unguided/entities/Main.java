/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama     : Hafshoh Imroatun Naila
// NIM      : 2311110056
// Kelas    : SD0402

package unguided.entities;

/**
 *
 * @author HP
 */


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //membuat dokter
        Doctor doctor = new Doctor("dr. Naila", "Ortopedi");

        //membuat pasien
        Patient patient = new Patient("Jessica", 31, "Skoliosis");

        //membuat janji temu
        Appointment appointment = new Appointment(doctor, patient, new Date());

        //menampilkan informasi yang sudah dimasukkan sebelumnya
        System.out.println("Dokter: " + doctor.getName() + " - " + doctor.getSpecialization());
        System.out.println("Pasien: " + patient.getName() + " - Usia: " + patient.getAge());
        System.out.println("Diagnosis: " + patient.getDiagnosis());
        System.out.println("Janji Temu: " + appointment.getDate());
    }
}
