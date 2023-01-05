package by.teachmeskills.homework8.oop.clinic;

import by.teachmeskills.homework8.oop.clinic.entity.Patient;
import by.teachmeskills.homework8.oop.clinic.entity.TreatmentPlan;
import by.teachmeskills.homework8.oop.clinic.service.Clinic;

public class ClinicDemo {
    public static void main(String[] args) {
        Patient patient = new Patient("Alena");
        patient.setTreatmentPlan(new TreatmentPlan(-1));
        Clinic clinic = new Clinic();
        clinic.appointDoctorToPatient(patient);

        TreatmentPlan treatmentPlan = new TreatmentPlan();
        treatmentPlan.setCode(2);
        patient.setTreatmentPlan(treatmentPlan);
        clinic.appointDoctorToPatient(patient);
    }
}
