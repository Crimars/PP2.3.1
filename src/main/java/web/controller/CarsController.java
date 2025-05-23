package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        int size = (count != null && count > 0) ? Math.min(count, 5) : 5;
        List<Car> cars = carService.getNCars(size);
        model.addAttribute("cars", cars);
        return "cars";
    }
}