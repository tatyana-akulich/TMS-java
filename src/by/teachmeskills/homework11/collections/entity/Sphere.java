package by.teachmeskills.homework11.collections.entity;

import java.util.Objects;

public class Sphere implements Comparable<Sphere> {
    private int id;
    private final double size;

    public Sphere(int id, double size) {
        this.size = size;
        this.id = id;
    }

    public double getSize() {
        return size;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sphere)) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.getSize(), getSize()) == 0 ||
                Objects.equals(getId(), sphere.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSize());
    }

    @Override
    public String toString() {
        return "Id = " + id +
                ", size = " + size +
                "\n";
    }

    @Override
    public int compareTo(Sphere sphere) {
        return Double.compare(size, sphere.getSize());
    }
}
