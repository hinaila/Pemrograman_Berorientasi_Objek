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

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Date getDate() {
        return date;
    }
}

