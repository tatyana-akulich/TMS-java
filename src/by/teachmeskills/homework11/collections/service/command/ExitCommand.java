package by.teachmeskills.homework11.collections.service.command;

import by.teachmeskills.homework11.collections.entity.Box;
import by.teachmeskills.homework11.collections.service.Service;

public class ExitCommand implements Command {
    private Service service;

    ExitCommand(Service service) {
        this.service = service;
    }

    @Override
    public void execute(Box box) {
        System.out.println("Working with box is finished");
        service.setEndChecking(true);
    }
}
