package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCarList(@RequestParam(value = "count", defaultValue = "5")
                             Integer amountOfCars, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, 1, "one"));
        carList.add(new Car(2, 2, "two"));
        carList.add(new Car(3, 3, "three"));
        carList.add(new Car(4, 4, "four"));
        carList.add(new Car(5, 5, "five"));
        carList = carService.requestedCars(carList, amountOfCars);
        model.addAttribute("carList", carList);
        return "cars";
    }
}
