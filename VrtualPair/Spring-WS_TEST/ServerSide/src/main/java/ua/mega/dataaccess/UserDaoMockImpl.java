package ua.mega.dataaccess;

import ua.mega.domain.User;
import ua.mega.services.UserNotFound;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMockImpl implements UserDao {

    private List<User> usersDB = new ArrayList<User>();

    public void createUser(User user) {
        usersDB.add(user);
    }

    public User readUser(String id) throws UserNotFound {
        System.out.println(id);
        /*if (Integer.getInteger(id) / 2 == 0) */usersDB.add(new User(id, "Name " + id));

        User foundUser = null;
        for (User next : usersDB) {
            if (next.getId() == id) foundUser = next;
        }
        if (foundUser != null) return foundUser;
        else throw new UserNotFound();
    }
}
