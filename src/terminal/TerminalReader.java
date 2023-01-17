package terminal;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private CommandExecutableFactory commandExecutableFactory;
    private ResultDisplayedFactory resultDisplayedFactory;
    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void getInput(String command) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String inputt = scanner.nextLine();
            String[] cool = CommandParser.parseCommand(inputt);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);
            commandExecutable.execute();

            ResultDisplayed resultDisplayed = resultDisplayedFactory.create(cool[0], commandExecutable);
            resultDisplayed.display();
        }
    }

    public static TerminalReader getInstance(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory,
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
}
