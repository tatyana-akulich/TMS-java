package by.teachmeskills.homework8.oop.clinic.entity;

public class Doctor {
    private String name;
    private DoctorsSpecializations specialization;

    public Doctor(String name, DoctorsSpecializations specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Doctor(DoctorsSpecializations specialization) {
        this.specialization = specialization;
        this.name = "Unknown";
    }

    public DoctorsSpecializations getSpecialization() {
        return specialization;
    }
}
