package com.example.myshop.model;

import org.springframework.stereotype.Component;

//Класс с полями для объекта - Еда
@Component
public class Food extends Product {

    public Food(String productName, int productId, int productPrice, String productColor) {
        super(productName, productId, productPrice, productColor);
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public void setProductName(String productName) {
        super.setProductName(productName);
    }

    @Override
    public int getProductId() {
        return super.getProductId();
    }

    @Override
    public void setProductId(int productId) {
        super.setProductId(productId);
    }

    @Override
    public int getProductPrice() {
        return super.getProductPrice();
    }

    @Override
    public void setProductPrice(int productPrice) {
        super.setProductPrice(productPrice);
    }

    @Override
    public String getProductColor() {
        return super.getProductColor();
    }

    @Override
    public void setProductColor(String productColor) {
        super.setProductColor(productColor);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
