package com.company;

import java.util.Scanner;

public class Van extends Vehicle {
    private  int Cargo_volume;
    Vehicle vehicle=new Vehicle() {
        @Override
        public void set_values() {
            super.set_values();
        }
    };

    public int getCargo_volume() {
        return Cargo_volume;
    }

    public  void setCargo_volume(int cargo_volume) {
        Cargo_volume = cargo_volume;
    }

    public void van() {
        Scanner en =new Scanner(System.in);
        System.out.println("Cargo volume:");
        int cargo_volume=en.nextInt();
        en.nextLine();
        setCargo_volume(cargo_volume);
    }
    public  void get_values() {
        System.out.println("Vehicle id:"+getVehicle_id());
        System.out.println("Brand:"+getBrand());
        System.out.println("Entry time:"+getEntry_time());
        System.out.println("Cargo volume:"+getCargo_volume());

    }
}
