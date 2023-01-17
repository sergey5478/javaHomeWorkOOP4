package terminal;

import terminal.executable.BadCommandExecutable;
import terminal.executable.CommandExecutable;

public class CreateStudentDisplayed implements ResultDisplayed {
    private final CommandExecutable commandExecutable;

    public CreateStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void display() {
        if (commandExecutable instanceof BadCommandExecutable) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Студент добавлен");
        }
    }
}
