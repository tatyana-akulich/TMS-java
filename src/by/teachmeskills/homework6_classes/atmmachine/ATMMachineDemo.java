package by.teachmeskills.homework6_classes.atmmachine;

public class ATMMachineDemo {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(10, 5, 7);
        atmMachine.addMoney(3, 0, 2);
        boolean testNotEnoughMoney = atmMachine.withdrawMoney(5015);
        System.out.println("Was operation successful - " + testNotEnoughMoney + "\n");
        boolean testSuitableNotes = atmMachine.withdrawMoney(25);
        System.out.println("Was operation successful - " + testSuitableNotes + "\n");
        boolean testPositive1 = atmMachine.withdrawMoney(140);
        System.out.println("Was operation successful - " + testPositive1 + "\n");
        boolean testPositive2 = atmMachine.withdrawMoney(170);
        System.out.println("Was operation successful - " + testPositive2 + "\n");
    }
}
