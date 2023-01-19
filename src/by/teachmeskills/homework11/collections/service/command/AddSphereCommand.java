package by.teachmeskills.homework11.collections.service.command;

import by.teachmeskills.homework11.collections.entity.Box;
import by.teachmeskills.homework11.collections.entity.Sphere;
import by.teachmeskills.homework11.collections.service.Service;
import by.teachmeskills.homework11.collections.view.View;

import java.util.List;

public class AddSphereCommand implements Command {
    private View view;
    private Service service;
    private List<Sphere> sphereList;

    AddSphereCommand(Service service, List<Sphere> sphereList) {
        this.sphereList = sphereList;
        this.service = service;
        view = service.getView();
    }

    @Override
    public void execute(Box box) {
        int number = view.chooseSpheres(sphereList);
        System.out.println(number);
        if (number == sphereList.size() + 1) {
            Sphere sphere = service.createOneSphere();
            box.addSphere(sphere);
        } else {
            box.addSphere(sphereList.get(number - 1));
        }
        box.printAllSpheres();
    }
}
