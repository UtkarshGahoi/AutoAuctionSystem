package org.example;

public class Bidder extends Person{
    private double predefinedIncrement;
    private double maxPrice;
    private boolean isAutobidding;
    Bidder(String name, double predefinedIncrement, double maxPrice, boolean isAutobidding){
        super.name = name;
        this.predefinedIncrement = predefinedIncrement;
        this.isAutobidding = isAutobidding;
        this.maxPrice = maxPrice;
    }

    public double getPredefinedIncrement(){
        return predefinedIncrement;
    }

    public double getMaxPrice() {
        return maxPrice;
    }
}
