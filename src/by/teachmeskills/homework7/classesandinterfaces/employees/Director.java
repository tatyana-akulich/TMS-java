package by.teachmeskills.homework7.classesandinterfaces.employees;

public class Director implements Position {
    private String name;

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void PrintFromClass() {
        System.out.println(this.name + " is " + this.getClass().getSimpleName());
    }
}
