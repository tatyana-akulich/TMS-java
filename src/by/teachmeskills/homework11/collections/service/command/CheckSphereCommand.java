package by.teachmeskills.homework11.collections.service.command;

import by.teachmeskills.homework11.collections.entity.Box;
import by.teachmeskills.homework11.collections.entity.Sphere;
import by.teachmeskills.homework11.collections.service.Service;
import by.teachmeskills.homework11.collections.view.View;

import java.util.List;

public class CheckSphereCommand implements Command {
    private View view;
    private Service service;
    private List<Sphere> sphereList;

    CheckSphereCommand(Service service, List<Sphere> sphereList) {
        this.sphereList = sphereList;
        this.service = service;
        view = service.getView();
    }

    @Override
    public void execute(Box box) {
        int number = view.chooseSpheres(sphereList);
        boolean result;
        if (number == sphereList.size() + 1) {
            Sphere sphere = service.createOneSphere();
            result = box.isSpherePresent(sphere);
        } else {
            result = box.isSpherePresent(sphereList.get(number - 1));
        }
        System.out.println("Check if sphere is in the box - " + result);
    }
}
