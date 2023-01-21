package terminal.executable.factory;

import data.user.User;
import service.user.StudentService;
import terminal.Command;
import terminal.executable.executables.*;
import terminal.executable.forms.UserForms;
public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private final UserFormerFactory userFormerFactory;
    private final CommandsFactory commandsFactory;
    protected final StudentService studentService;

    public CommandExecutableFactoryImpl(StudentService studentService) {
        this.studentService = studentService;
        this.userFormerFactory = new UserFormerFactory();
        this.commandsFactory = new CommandsFactory(studentService);
    }
    @Override
    public CommandExecutable create(Command command) {
        UserForms userForms = userFormerFactory.createUserFormer(command);
        User user = userForms.createUser();

        if (user != null) {
           CommandUserExecutableFactory commandUserExecutableFactory = commandsFactory.createCommandFactory(command);
           return commandUserExecutableFactory.createCommandExecutable(user);
        } else return new NoneCommandExecutable();
    }
}
