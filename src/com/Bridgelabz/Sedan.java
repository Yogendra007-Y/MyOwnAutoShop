package com.Bridgelabz;

public class Sedan extends Car{
    int length;

    //Creating Constructor To Give Values To Variables
    public Sedan(int speed, double regularPrice, String colour, int length) {
        super(speed, regularPrice, colour);
        this.length = length;
    }

    @Override
    //To Compute Price According To Length Of Car
    public double getSalePrice() {
        if(length > 20){
            regularPrice = regularPrice - (regularPrice / 20);
        }
        else{
            regularPrice = regularPrice - (regularPrice / 10);
        }
        return regularPrice;
    }

    @Override
    public String toString() {
        return "Sedan(length=" +length+ ", getSalePrice=" +getSalePrice()+")";
    }
}
