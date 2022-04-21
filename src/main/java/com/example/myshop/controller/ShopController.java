package com.example.myshop.controller;

import com.example.myshop.model.Clothes;
import com.example.myshop.model.Food;
import com.example.myshop.model.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping
//@Controller
    public class ShopController {

    @GetMapping ("/userenter")
    public String userName (@RequestParam(value = "name", required = false) String name,
                            Model model) {
        System.out.println("Добро пожаловать, " + name);
        return "/userenter";
    }

    @GetMapping("/clothes")
    public List<Clothes> getClothes() {
        return getClothes();
    }

    @GetMapping("/food")
    public List<Food> getFood() {
        return getFood();
    }

    @GetMapping("/tecnology")
    public List<Technology> getTechnology() {
        return getTechnology();
    }

//    @GetMapping ("/sumofproducts")
//    public class SumOfProducts {
//        return sumOfProducts();
    }

