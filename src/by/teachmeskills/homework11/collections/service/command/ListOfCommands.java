package by.teachmeskills.homework11.collections.service.command;

import by.teachmeskills.homework11.collections.entity.Sphere;
import by.teachmeskills.homework11.collections.service.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfCommands {
    private Map<Integer, Command> commandMap = new HashMap<>();

    public Map<Integer, Command> getCommandMap() {
        return commandMap;
    }

    public ListOfCommands(Service service, List<Sphere> sphereList) {
        commandMap.put(0, new ShowBoxCommand());
        commandMap.put(1, new AddSphereCommand(service, sphereList));
        commandMap.put(2, new DeleteSphereCommand(service, sphereList));
        commandMap.put(3, new CountSpheresCommand());
        commandMap.put(4, new CountSizeCommand());
        commandMap.put(5, new ClearBoxCommand());
        commandMap.put(6, new CheckSphereCommand(service, sphereList));
        commandMap.put(7, new PrintSizesCommand());
        commandMap.put(8, new SortSpheresCommand());
        commandMap.put(9, new ExitCommand(service));
    }
}
