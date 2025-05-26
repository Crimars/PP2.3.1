package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
    public class UserService {
        private final List<User> cars = new ArrayList<>(Arrays.asList(
                new User(1, "Kia", 2010),
                new User(2, "Honda", 2019),
                new User(3, "Ford", 2021),
                new User(4, "BMW", 2018),
                new User(5, "Lada", 2015)
        ));
    public List<User> getNCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}

