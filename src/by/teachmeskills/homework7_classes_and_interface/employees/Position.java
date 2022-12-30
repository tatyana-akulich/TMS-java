package by.teachmeskills.homework7_classes_and_interface.employees;

public interface Position {
    default void printFromInterface() {
        System.out.println("Position is " + this.getClass().getSimpleName());
    }

    void PrintFromClass();
}
