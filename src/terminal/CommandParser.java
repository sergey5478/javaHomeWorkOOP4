package terminal;

import java.util.Arrays;

public interface CommandParser {

    default String parseCommand(String inputCommand){
        return Arrays.stream(inputCommand.split(" ")).toString();
    };
}
