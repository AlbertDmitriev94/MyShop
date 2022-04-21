package com.example.myshop.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClothesList {

    public List<Clothes> getClothes() {
        Clothes jeans = new Clothes("Джинсы", 1, 3000,  "Черные");
        Clothes tShirts = new Clothes("Футболка", 2, 500, "Серая");
        Clothes sneakers = new Clothes("Кроссовки", 3, 1500, "Белые");
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(jeans);
        clothes.add(tShirts);
        clothes.add(sneakers);
        return clothes;
    }


}


