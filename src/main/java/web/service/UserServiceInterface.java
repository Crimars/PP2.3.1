package web.service;

import web.model.User;
import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUsers();
    User getUserById(Long id);
    User save(User user);
    void deleteById(Long id);
}