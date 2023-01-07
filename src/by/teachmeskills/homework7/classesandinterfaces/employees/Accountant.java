package by.teachmeskills.homework7.classesandinterfaces.employees;

public class Accountant implements Position {
    private String name;

    public Accountant(String name) {
        this.name = name;
    }

    @Override
    public void printFromClass() {
        System.out.println(this.name + " is " + this.getClass().getSimpleName());
    }
}
