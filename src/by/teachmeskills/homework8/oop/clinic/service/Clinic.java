package by.teachmeskills.homework8.oop.clinic.service;

import by.teachmeskills.homework8.oop.clinic.entity.Doctor;
import by.teachmeskills.homework8.oop.clinic.entity.DoctorsSpecializations;
import by.teachmeskills.homework8.oop.clinic.entity.Patient;

public class Clinic {

    public void appointDoctorToPatient(Patient patient) {
        Doctor doctor;
        switch (patient.getTreatmentPlan().getCode()) {
            case 1: {
                doctor = new Doctor(DoctorsSpecializations.SURGEON);
                break;
            }
            case 2: {
                doctor = new Doctor("Petrova Natalia Sergeevna", DoctorsSpecializations.DENTIST);
                break;
            }
            default:
                doctor = new Doctor(DoctorsSpecializations.THERAPIST);
        }
        patient.setDoctor(doctor.getSpecialization());
        doctor.getSpecialization().treat();
    }
}
