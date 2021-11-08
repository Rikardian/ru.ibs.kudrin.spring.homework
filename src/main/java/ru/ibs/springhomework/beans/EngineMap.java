package ru.ibs.springhomework.beans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.HashMap;
import java.util.Map;

@Configuration
public class EngineMap {

    @Bean
    public Map<String, Engine> engineMapInitializer(){
        Map<String, Engine> engineMap = new HashMap<>();
        engineMap.put("petrol", new PetrolEngine());
        engineMap.put("diesel", new DieselEngine());

        return engineMap;
    }

}
