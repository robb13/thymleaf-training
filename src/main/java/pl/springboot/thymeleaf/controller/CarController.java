package pl.springboot.thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.springboot.thymeleaf.model.Car;


@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model) {
        Car car = new Car("BMW", "i8");
        model.addAttribute("name", "Robert");
        model.addAttribute("car", car);
        return "car";
    }


}
