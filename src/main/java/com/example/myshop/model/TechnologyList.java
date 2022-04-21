package com.example.myshop.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TechnologyList {

    public List<Technology> getTechnology() {
        Technology phone = new Technology("Телефон", 1, 50000, "Красный");
        Technology tv = new Technology("Телевизор", 2, 25000, "Серебристый");
        Technology pc = new Technology("Компьютер", 3, 50000, "Неоновый");
        List<Technology> technologies = new ArrayList<>();
        technologies.add(phone);
        technologies.add(tv);
        technologies.add(pc);
        return technologies;
    }
}
