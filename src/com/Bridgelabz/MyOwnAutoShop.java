package com.Bridgelabz;

public class MyOwnAutoShop {

    public static void main(String[] args) {
        System.out.println("Welcome To My Own Auto Shop");
        //Object For Car
        Car car =new Car(80,152000, "NavyBlue");
        System.out.println("\n All The Fields of Car Are: " +car);

        //Object For Truck
        Truck truck = new Truck(40, 100000, "Red", 1500 );
        System.out.println("\n All The Fields of Truck Are: " +truck);

        //Object For Ford
        Ford ford = new Ford(90, 400000, "RoyalBlue", 2019, 12000);
        System.out.println("\n All The Fields of Ford Are: " +ford);

        //Object For Ford1
        Ford ford1 = new Ford(95, 452000, "Black", 2021, 2000);
        System.out.println("\n All The Fields of Ford1 Are: " +ford1);

        //Object For Sedan
        Sedan sedan = new Sedan(85, 320000, "Grey", 18);
        System.out.println("\n All The Fields of Sedan Are: " +sedan);

    }
}