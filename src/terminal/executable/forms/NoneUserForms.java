package terminal.executable.forms;

import data.user.User;

import java.util.ArrayList;

public class NoneUserForms extends UserForms {
    public NoneUserForms(ArrayList<String> commands) {
        super(commands);
    }
    @Override
    public User createUser() {
        return null;
    }
}
