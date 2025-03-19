/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided.entities;

/**
 *
 * @author HP
 */

import java.util.ArrayList;
import java.util.List;

//enkapsulasi diterapkan dengan membuat atribut private, jadi hanya bisa diakses lewat getter
public class Doctor {
    private String name; //menyimpan nama dokter 
    private String specialization; //menyimpan spesialisasi dokter
    private List<Appointment> appointments;

    //konstruktor untuk inisialisasi objek doctor
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }

    //getter nama dokter
    public String getName() {
        return name;
    }

    //getter spesialisasi dokter
    public String getSpecialization() {
        return specialization;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }
}
