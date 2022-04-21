package com.example.myshop.model;

import java.util.Objects;

public class Product {

    private String productName;
    private int productId;
    private int productPrice;
    private String productColor;

    public Product(String productName, int productId, int productPrice, String productColor) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productColor = productColor;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", productPrice=" + productPrice +
                ", productColor='" + productColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && productPrice == product.productPrice && Objects.equals(productName, product.productName) && Objects.equals(productSize, product.productSize) && Objects.equals(productColor, product.productColor);
    }
}
