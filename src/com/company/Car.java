package com.company;

import java.util.Scanner;

public class Car extends Vehicle {
    private static int Nodoor;
    private String Colour;

    Vehicle vehicle=new Vehicle() {
        @Override
        public void set_values() {
            super.set_values();
        }
    };

    public int getNodoor() {
        return Nodoor;
    }

    public static void setNodoor(int nodoor) {
        Nodoor = nodoor;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;

    }
    public  void car() {
        Scanner en =new Scanner(System.in);
        System.out.println("no of doors:");
        int Nodoor=en.nextInt();
        en.nextLine();
        setNodoor(Nodoor);
        System.out.println("colour:");
        String Colour;
        Colour=en.nextLine();
        setColour(Colour);
    }

    public  void get_values() {
        System.out.println("Vehicle id:"+getVehicle_id());
        System.out.println("Brand:"+getBrand());
        System.out.println("Entry time:"+getEntry_time());
        System.out.println("No of doors:"+getNodoor());
        System.out.println("Colour:"+getColour());

    }

}
