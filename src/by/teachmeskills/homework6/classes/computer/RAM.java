package by.teachmeskills.homework6.classes.computer;

public class RAM {
    private String name;
    private int volume;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }
}