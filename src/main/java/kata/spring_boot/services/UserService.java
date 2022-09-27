package kata.spring_boot.services;

import kata.spring_boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser(Long id);

    User createUser(User user);

    void editUser(User user);
}
