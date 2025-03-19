/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.entities;

/**
 *
 * @author HP
 */
import java.util.Date; //pakai library date untuk menyimpan tanggal reservasi/janji temu

//kelas ini menunjukan relasi antara dokter dan pasien sehingga menghubungkan keduanya
public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private Date date;

    public Appointment(Doctor doctor, Patient patient, Date date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        doctor.addAppointment(this);
    }

    //getter untuk mendapatkan dokter dari janji temu
    public Doctor getDoctor() {
        return doctor;
    }

    //getter untuk mendapatkan pasien dari janji temu
    public Patient getPatient() {
        return patient;
    }

    //getter untuk mendapatkan tanggal janji temu
    public Date getDate() {
        return date;
    }
}

