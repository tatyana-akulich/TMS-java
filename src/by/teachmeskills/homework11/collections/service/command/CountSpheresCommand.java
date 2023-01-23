package by.teachmeskills.homework11.collections.service.command;

import by.teachmeskills.homework11.collections.entity.Box;

public class CountSpheresCommand implements Command {

    @Override
    public void execute(Box box) {
        box.countSpheres();
    }
}
