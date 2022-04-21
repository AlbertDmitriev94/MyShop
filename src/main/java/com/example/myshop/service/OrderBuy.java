package com.example.myshop.service;
import com.example.myshop.service.impl.BuyProducts;

    public class OrderBuy implements BuyProducts {

        @Override
        public void buyProducts() {
            System.out.println("Покупка товаров исполнена");
        }



}
