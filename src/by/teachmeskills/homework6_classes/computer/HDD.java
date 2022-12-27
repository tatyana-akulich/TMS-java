package by.teachmeskills.homework6_classes.computer;

public class HDD {
    private String name;
    private int volume;
    HDDType type;

    public HDD() {
    }

    public HDD(String name, int volume, HDDType type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type=" + type +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }
}
