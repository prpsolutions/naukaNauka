package com.kodilla;

public class Audi {
    private String model;
    private double price;

    public Audi(String model, double price){
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
