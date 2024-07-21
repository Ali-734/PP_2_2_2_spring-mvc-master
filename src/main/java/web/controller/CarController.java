package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private List<Car> carList;
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
        this.carList = new ArrayList<>();
        this.carList.add(new Car("daewoo", "rus", 734));
        this.carList.add(new Car("bmw", "de", 705));
        this.carList.add(new Car("mercedes", "de", 333));
        this.carList.add(new Car("kia", "kor", 222));
        this.carList.add(new Car("Li", "chin", 133));
    }

    @GetMapping
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> carsToShow = carService.getCars(count, carList);
        model.addAttribute("carList", carsToShow);
        return "cars";
    }

}




