package ru.ibs.springhomework.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class DieselEngine implements Engine{

    private static String type;

    public DieselEngine() {
        this.type = "diesel";
    }

    public static String getType() {
        return type;
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на дизельном топливе";
    }
}
