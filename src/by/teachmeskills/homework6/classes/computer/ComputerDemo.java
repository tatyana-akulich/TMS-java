package by.teachmeskills.homework6.classes.computer;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000, "Model1");
        computer1.printInfo();
        Computer computer2 = new Computer(2000, "Model2",
                new RAM("RAM1", 2000), new HDD("HDD1", 1000, HDDType.OUTER));
        computer2.printInfo();
    }
}
