package by.teachmeskills.homework7.classesandinterfaces.employees;

public interface Position {
    default void printFromInterface() {
        System.out.println("Position is " + this.getClass().getSimpleName());
    }

    void printFromClass();
}
