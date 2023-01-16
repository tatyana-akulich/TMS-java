package by.teachmeskills.homework8.oop.clinic.entity;

public class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;
    private DoctorsSpecializations doctor;

    public Patient(String name) {
        this.name = name;
    }

    public Patient(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public String getName() {
        return name;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public DoctorsSpecializations getDoctor() {
        return doctor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(DoctorsSpecializations doctor) {
        this.doctor = doctor;
    }
}
