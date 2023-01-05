package by.teachmeskills.homework8.oop.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone() {
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    void receiveCall(String name) {
        System.out.printf("%s is calling\n", name);
    }

    void receiveCall(String name, String number) {
        System.out.printf("%s is calling (%s)\n", name, number);
    }

    void sendMessage(String... numbers) {
        System.out.println("List of numbers for messaging:");
        for (String element : numbers
        ) {
            System.out.println(element);
        }
    }

    @Override
    public String toString() {
        return "number: " + number +
                ", model: '" + model + '\'' +
                ", weight: " + weight;
    }
}
