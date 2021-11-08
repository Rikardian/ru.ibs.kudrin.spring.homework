package ru.ibs.springhomework.beans;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@Controller
public class FuelController {

        public static Map<String, Engine> engineMap = new HashMap<>();
        Engine dieselEngine = new DieselEngine();
        Engine petrolEngine = new PetrolEngine();

    @FuelExceptionHandle
    @RequestMapping("/mvc/fuel")
    public String checkFuelType(@RequestParam(name = "name", required = false) String engineType, Model model){
        model.addAttribute("name", engineMap.get(engineType).powerUp());

        return "engineType";
    }


}
