package codeFlow;

import java.util.ArrayList;

public class UserHandler {
    private ArrayList<User> users = new ArrayList<>();

    public boolean createUser(String name, String password) {
        if (!DataValidator.isPasswordValid(password) || !DataValidator.isUserNameValid(name)) {
            return false;
        } else {
            for (User user : users) {
                if (user.getName().equals(name)) {
                    return false;
                }
            }
        }
        users.add(new User(name, password));
        return true;
    }

    public boolean addUser(User u) {
        for (User user : users) {
            if (user.getName().equals(u.getName())) {
                return false;
            }
        }
        users.add(u);
        return true;
    }

    public boolean login(String name, String password) {
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }


}