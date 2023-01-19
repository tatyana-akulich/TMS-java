package by.teachmeskills.homework11.collections;

import by.teachmeskills.homework11.collections.entity.Sphere;
import by.teachmeskills.homework11.collections.service.Service;
import by.teachmeskills.homework11.collections.view.View;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        View view = new View();
        view.printMessage("Creating of spheres for box");
        Service service = new Service(view);
        List<Sphere> sphereList = service.createSpheresList();
        view.printMessage("Working with box");
        service.checkBox(sphereList, service);
    }
}
