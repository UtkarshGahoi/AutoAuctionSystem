package org.example;

public class Seller extends  Person{
    private Product product;
    Seller(String name,Product product){
        super.name = name;
        this.product = product;
    }

    public boolean setProductReservePrice(double reservePrice){
        product.setReservePrice(reservePrice);
        System.out.println("new reservePrice is : " + reservePrice);
        return true;
    }

    public Product getProduct(){
        return product;
    }
}
