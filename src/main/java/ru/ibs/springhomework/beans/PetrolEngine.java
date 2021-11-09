package ru.ibs.springhomework.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PetrolEngine implements Engine{

    private static String type;

    public PetrolEngine() {
        this.type = "petrol";
    }

    public static String getType() {
        return type;
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на бензиновом топливе";
    }
}
