package terminal;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandParser {
    public Command parseCommand(String inputCommand) {
        return new Command(new ArrayList<String>(Arrays.asList(inputCommand.split(" "))));
    }
}
