package org.example;

public class Product {
    private String productName;
    private String description;
    private double reservePrice;

    Product(String productName, String description, double reservePrice){
        this.productName = productName;
        this.description = description;
        this.reservePrice = reservePrice;
    }

    public void setReservePrice(double newPrice){
        this.reservePrice = newPrice;
    }

    public double getReservePrice(){
        return this.reservePrice;
    }
}
