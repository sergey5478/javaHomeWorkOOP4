package terminal.executable.factory;

import terminal.Command;
import terminal.executable.forms.NoneUserForms;
import terminal.executable.forms.StudentForms;
import terminal.executable.forms.UserForms;

public class UserFormerFactory {
    public UserForms createUserFormer(Command command) {
        if (command.isStudentCommand()) {
            return new StudentForms(command.getCommands());
        } else return new NoneUserForms(command.getCommands());
    }
}