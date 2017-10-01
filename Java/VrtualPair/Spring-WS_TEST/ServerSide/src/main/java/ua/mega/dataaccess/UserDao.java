package ua.mega.dataaccess;

import ua.mega.domain.User;
import ua.mega.services.UserNotFound;

public interface UserDao {
    void createUser(User user);

    User readUser(String id) throws UserNotFound;
}
