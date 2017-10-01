package ua.mega.services;

import ua.mega.domain.User;

public interface UserManagementService {
    void registerNewUser(User user);

    User getUserById(String Id) throws UserNotFound;
}
