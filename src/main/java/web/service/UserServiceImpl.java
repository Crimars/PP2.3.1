package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.repository.UserRepo;
import web.repository.UserRepository;
import web.model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface{

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userRepo.getUserById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        }
        return userRepo.save(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}