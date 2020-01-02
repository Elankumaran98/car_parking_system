package com.company;

import java.util.Scanner;

public abstract class Vehicle {
    private String vehicle_id;
    private String brand;
    private String entry_time;

    public Vehicle() {
    }

    public Vehicle(String vehicle_id, String brand, String entry_time) {
        this.vehicle_id = vehicle_id;
        this.brand = brand;
        this.entry_time = entry_time;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }
    public void set_values(){
        Scanner en =new Scanner(System.in);
        System.out.println("enter vehicle id:");
        String selection_id=en.nextLine();
        setVehicle_id(selection_id);
        System.out.println("enter vehicle brand:");
        String selection_brand=en.nextLine();
        setBrand(selection_brand);
        System.out.println("enter vehicle Entry time:");
        String selection_time=en.nextLine();
        setEntry_time(selection_time);
    }

}