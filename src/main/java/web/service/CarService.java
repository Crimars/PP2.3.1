package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
    public class CarService {
        private final List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car(1, "Kia", 2010),
                new Car(2, "Honda", 2019),
                new Car(3, "Ford", 2021),
                new Car(4, "BMW", 2018),
                new Car(5, "Lada", 2015)
        ));
    public List<Car> getNCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}

