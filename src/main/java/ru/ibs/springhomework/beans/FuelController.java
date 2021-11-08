package ru.ibs.springhomework.beans;

import org.springframework.stereotype.Controller;

@Controller
public class FuelController {

    @FuelExceptionMethod
    public void checkFuelType(Engine engine){
        if (engine instanceof DieselEngine){
            System.out.println("Двигатель работает на дизельном топливе");
        }
        else if (engine instanceof PetrolEngine){
            System.out.println("Двигатель работает на бензиновом топливе");
        }
    }


}
