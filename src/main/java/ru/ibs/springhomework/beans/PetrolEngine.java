package ru.ibs.springhomework.beans;

import org.springframework.stereotype.Service;

@Service
public class PetrolEngine implements Engine{
    public PetrolEngine() {
        FuelController.engineMap.put("petrol", this);
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на бензиновом топливе";
    }
}
