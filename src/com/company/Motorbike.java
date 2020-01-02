package com.company;

import java.util.Scanner;

public class Motorbike  extends Vehicle {
    private int Engine_size;
    Vehicle vehicle=new Vehicle() {
        @Override
        public void set_values() {
            super.set_values();
        }
    };

    public int getEngine_size() {
        return Engine_size;
    }

    public void setEngine_size(int engine_size) {
        Engine_size = engine_size;
    }

    public void motorbike() {
        Scanner en =new Scanner(System.in);
        System.out.println("Engine size:");
        int Engine_size=en.nextInt();
        en.nextLine();
        setEngine_size(Engine_size);
    }
    public  void get_values() {
        System.out.println("Vehicle id:"+getVehicle_id());
        System.out.println("Brand:"+getBrand());
        System.out.println("Entry time:"+getEntry_time());
        System.out.println("Engine size:"+getEngine_size());
    }
}
