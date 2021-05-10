package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Service.CarService;

@Controller
public class CarController {
    CarService carService = new CarService();

    @GetMapping(value = "/car")
    public String prntCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count == null) {
            model.addAttribute("allCars", carService.getCarList(count));
        }
        model.addAttribute("allCars", carService.getCarList(count));
        return "car";
    }
}
