package by.teachmeskills.homework11.collections.service.command;

import by.teachmeskills.homework11.collections.entity.Box;
import by.teachmeskills.homework11.collections.entity.Sphere;
import by.teachmeskills.homework11.collections.service.Service;
import by.teachmeskills.homework11.collections.view.View;

import java.util.List;

public class DeleteSphereCommand implements Command {
    private View view;
    private Service service;
    private List<Sphere> sphereList;

    DeleteSphereCommand(Service service, List<Sphere> sphereList) {
        this.sphereList = sphereList;
        this.service = service;
        view = service.getView();
    }

    @Override
    public void execute(Box box) {
        int number = view.chooseSpheres(sphereList);
        if (number == sphereList.size() + 1) {
            Sphere sphere = service.createOneSphere();
            box.deleteSphere(sphere);
        } else {
            box.deleteSphere(sphereList.get(number - 1));
        }
        box.printAllSpheres();
    }
}
