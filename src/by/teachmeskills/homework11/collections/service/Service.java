package by.teachmeskills.homework11.collections.service;

import by.teachmeskills.homework11.collections.entity.Box;
import by.teachmeskills.homework11.collections.entity.Sphere;
import by.teachmeskills.homework11.collections.exceptions.EmptyBoxException;
import by.teachmeskills.homework11.collections.exceptions.SizeExceededException;
import by.teachmeskills.homework11.collections.service.command.*;
import by.teachmeskills.homework11.collections.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Service {
    private View view;
    private Random random = new Random();
    private boolean endChecking = false;

    public Service(View view) {
        this.view = view;
    }

    public View getView() {
        return view;
    }

    public void setEndChecking(boolean endChecking) {
        this.endChecking = endChecking;
    }

    public List<Sphere> createSpheresList() {
        Scanner scanner = new Scanner(System.in);
        int amountOfSpheres;
        do {
            view.printMessage("Enter POSITIVE amount of spheres");
        }
        while ((amountOfSpheres = scanner.nextInt()) <= 0);
        List<Sphere> sphereList = new ArrayList<>();
        for (int i = 0; i < amountOfSpheres; i++) {
            System.out.printf("%d ", i + 1);
            sphereList.add(createOneSphere());
        }
        return sphereList;
    }

    public Sphere createOneSphere() {
        Scanner scanner = new Scanner(System.in);
        double size;
        do {
            view.printMessage("Enter POSITIVE size of sphere");
        }
        while ((size = scanner.nextDouble()) <= 0);
        return new Sphere(random.nextInt(20), size);
    }

    public void checkBox(List<Sphere> sphereList, Service service) {
        Box box = createBox();
        while (!endChecking) {
            try {
                causeOperation(box, sphereList, service);
            } catch (EmptyBoxException | SizeExceededException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Box createBox() {
        return new Box(view.getPositiveInt());
    }

    private void causeOperation(Box box, List<Sphere> sphereList, Service service) {
        int operation = view.getCommand();
        ListOfCommands listOfCommands = new ListOfCommands(service, sphereList);
        listOfCommands.getCommandMap().get(operation).execute(box);
    }
}
