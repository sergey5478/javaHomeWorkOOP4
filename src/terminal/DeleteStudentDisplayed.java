package terminal;

import terminal.executable.CommandExecutable;
import terminal.executable.BadCommandExecutable;

public class DeleteStudentDisplayed implements ResultDisplayed{
    private final CommandExecutable commandExecutable;

    public DeleteStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }
    @Override
    public void display() {
        if (commandExecutable instanceof BadCommandExecutable) {
            System.out.println("Студент не удален");
        } else {
            System.out.println("Студент удален");
        }
    }

}
