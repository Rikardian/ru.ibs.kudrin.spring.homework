package ru.ibs.springhomework.beans;

import org.springframework.stereotype.Service;

@Service
public class DieselEngine implements Engine{

    @Override
    public String powerUp() {
        return "Двигатель работает на дизельном топливе";
    }
}
