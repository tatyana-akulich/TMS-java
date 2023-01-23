package by.teachmeskills.homework11.collections.entity;

import by.teachmeskills.homework11.collections.exceptions.EmptyBoxException;
import by.teachmeskills.homework11.collections.exceptions.SizeExceededException;

import java.util.Set;
import java.util.TreeSet;

public class Box extends Container {
    private final int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public void addSphere(Sphere sphere) {
        if (!(spheres.size() >= size)) {
            super.addSphere(sphere);
        } else {
            throw new SizeExceededException();
        }
    }

    public Set<Sphere> sortBySize() {
        if (spheres.isEmpty()) {
            throw new EmptyBoxException();
        } else {
            Set<Sphere> treeSet = new TreeSet<>(spheres);
            System.out.println("List of elements sorted by size:");
            treeSet.forEach(element -> System.out.println(element.getId() + " - " + element.getSize()));
            return treeSet;
        }
    }
}
