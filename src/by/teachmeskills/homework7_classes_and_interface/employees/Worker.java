package by.teachmeskills.homework7_classes_and_interface.employees;

public class Worker implements Position {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void PrintFromClass() {
        System.out.println(this.name + " is " + this.getClass().getSimpleName());
    }
}
