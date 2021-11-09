package ru.ibs.springhomework.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/mvc/fuel")
public class FuelController {


    @Autowired
    DieselEngine dieselEngine;

    @Autowired
    PetrolEngine petrolEngine;

    @GetMapping(value = "check")
    @FuelExceptionHandle
    public String checkFuelType(@RequestParam(name = "type", required = false) String type, Model model) throws Exception {


        if (DieselEngine.getType().equals(type)){
            model.addAttribute("name", dieselEngine.powerUp());
        }
        else if (PetrolEngine.getType().equals(type)){
            model.addAttribute("name", petrolEngine.powerUp());
        }
        else {
            throw new Exception();
        }


        return "engineType";
    }


}
