package by.teachmeskills.homework6.classes.computer;

public class HDD {
    private String name;
    private int volume;
    private HDDType type;

    public HDD() {
    }

    public HDD(String name, int volume, HDDType type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public HDDType getType() {
        return type;
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
