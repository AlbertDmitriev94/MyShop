package com.example.myshop.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoodList {

    public List<Food> getFood() {
        Food apples = new Food("Яблоки", 1, 80,  "Красные");
        Food cookies = new Food("Печеньки", 2, 50, "С глазурью");
        Food chocolate = new Food("Шоколад", 3, 80, "Белый");
        List<Food> food = new ArrayList<>();
        food.add(apples);
        food.add(cookies);
        food.add(chocolate);
        return food;
    }
}
