package com.Bridgelabz;

public class Truck extends Car {
    int weight;

    //Creating Constructor To Give Values To Variables
    public Truck(int speed, double regularPrice, String colour, int weight) {
        super(speed, regularPrice, colour);
        this.weight = weight;
    }

    @Override
    //To Calculate Discount According To Weight OF Truck
    public double getSalePrice() {
        if(weight > 2000) {
            regularPrice = regularPrice - (regularPrice / 10);
        }
        else{
            regularPrice = regularPrice - (regularPrice / 5);
        }
        return regularPrice;

    }

    @Override
    public String toString() {
        return "Truck(weight=" +weight+ ", getSalePrice=" +getSalePrice()+")";
    }
}
