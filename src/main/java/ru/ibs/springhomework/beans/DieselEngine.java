package ru.ibs.springhomework.beans;

import org.springframework.stereotype.Service;


@Service
public class DieselEngine implements Engine{
    public DieselEngine() {
        FuelController.engineMap.put("diesel", this);
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на дизельном топливе";
    }
}
