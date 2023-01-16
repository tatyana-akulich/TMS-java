package by.teachmeskills.homework8.oop.clinic.entity;

public enum DoctorsSpecializations implements Treating {
    DENTIST {
        @Override
        public void treat() {
            System.out.println("Dentist is treating patient");
        }
    }, THERAPIST {
        @Override
        public void treat() {
            System.out.println("Therapist is treating patient");
        }
    }, SURGEON {
        @Override
        public void treat() {
            System.out.println("Surgeon is treating patient");
        }
    }
}
