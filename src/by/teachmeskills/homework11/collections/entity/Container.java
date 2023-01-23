package by.teachmeskills.homework11.collections.entity;

import by.teachmeskills.homework11.collections.exceptions.EmptyBoxException;

import java.util.HashSet;
import java.util.Set;

public class Container {
    Set<Sphere> spheres = new HashSet<>();

    public void addSphere(Sphere sphere) {
        System.out.printf("Name %s, size %.2f ", sphere.getId(), sphere.getSize());
        System.out.println(spheres.add(sphere) ? "Sphere is added" : "Sphere can't be added");
    }

    public void deleteSphere(Sphere sphere) {
        if (spheres.isEmpty()) {
            throw new EmptyBoxException();
        } else {
            System.out.printf("Name %s, size %.2f ", sphere.getId(), sphere.getSize());
            System.out.println(spheres.remove(sphere) ? "Sphere was deleted" : "Sphere can't be deleted");
        }
    }

    public int countSpheres() {
        System.out.println("Amount of spheres is " + spheres.size());
        return spheres.size();
    }

    public double countGeneralSize() {
        double generalSize = spheres.stream().mapToDouble(Sphere::getSize).sum();
        System.out.println("General size of all spheres is " + generalSize);
        return generalSize;
    }

    public void clearContainer() {
        spheres.clear();
        System.out.println("Container is cleared");
    }

    public boolean isSpherePresent(Sphere sphere) {
        return spheres.contains(sphere);
    }

    public void printAllSizes() {
        if (spheres.isEmpty()) {
            System.out.println("Container is empty");
        } else {
            System.out.println("Sizes of spheres");
            spheres.forEach(sphere -> System.out.println(sphere.getSize()));
        }
    }

    public void printAllSpheres() {
        if (spheres.isEmpty()) {
            System.out.println("Box is empty");
        } else {
            System.out.println("Now in the container are the next spheres: ");
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder finalResult = new StringBuilder();
        spheres.forEach(finalResult::append);
        return finalResult.toString();
    }
}
