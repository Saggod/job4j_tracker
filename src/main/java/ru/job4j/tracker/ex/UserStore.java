package ru.job4j.tracker.ex;

import java.util.Arrays;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User i : users) {
            if (i.getUsername().equals(login)) {
                return i;
            }
        }
        throw new UserNotFoundException("not found user");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("user not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }
}
