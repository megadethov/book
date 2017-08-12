package ua.mega.services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.mega.dataaccess.UserDao;
import ua.mega.domain.User;

public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    UserDao dao;

    public void registerNewUser(User user) {
        dao.createUser(user);
    }

    public User getUserById(String id) throws UserNotFound {

        return dao.readUser(id);
    }
}
