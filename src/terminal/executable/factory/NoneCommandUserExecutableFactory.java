package terminal.executable.factory;

import data.user.User;
import terminal.executable.executables.CommandExecutable;
import terminal.executable.executables.NoneCommandExecutable;
public class NoneCommandUserExecutableFactory implements CommandUserExecutableFactory{
    @Override
    public CommandExecutable createCommandExecutable(User user) {
        return new NoneCommandExecutable();
    }
}