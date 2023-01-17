package terminal;

import terminal.displayed.ResultDisplayed;
import terminal.displayed.ResultDisplayedFactory;
import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;
import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;
    private final ResultDisplayedFactory resultDisplayedFactory;

    public static TerminalReader getInstance(CommandParser commandParser,
                                             CommandExecutableFactory commandExecutableFactory,
                                             ResultDisplayedFactory resultDisplayedFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory, resultDisplayedFactory);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory,
                           ResultDisplayedFactory resultDisplayedFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
        this.resultDisplayedFactory = resultDisplayedFactory;
    }

    public void listenToCommands() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            String commands = commandParser.parseCommand(input);

            CommandExecutable commandExecutable = commandExecutableFactory.create(commands);
            commandExecutable.execute();

            ResultDisplayed resultDisplayed = resultDisplayedFactory.create(commands, commandExecutable);
            resultDisplayed.display();
        }
    }
}
