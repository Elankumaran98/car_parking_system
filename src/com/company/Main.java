package com.company;

import java.util.*;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        int x=0,y=0,z=0,a=0,b=0,c=0;
        Car car[]= new Car[20];
        Van van[]=new Van[10];
        Motorbike motorbike[]=new Motorbike[20];
        Scanner en = new Scanner(System.in);
        while (y!=4) {
            System.out.println("What did you want ?");
            System.out.println("1.park a vehicle\n2.view information\n3.remove a vehicle\n4.Exit");
            int selection1 = en.nextInt();
            switch (selection1) {
                case 1:
                    System.out.println("What is the vehicle?");
                    System.out.println("1.Car\n2.Van\n3.Motorbike");
                    int selection2 = en.nextInt();
                    switch (selection2) {
                        case 1:
                            Car Car = new Car();
                            Car.set_values();
                            Car.car();
                            car[x++] = Car;
                            break;
                        case 2:
                            Van Van = new Van();
                            Van.set_values();
                            Van.van();
                            van[c++] = Van;
                            break;
                        case 3:
                            Motorbike Motorbike = new Motorbike();
                            Motorbike.set_values();
                            Motorbike.motorbike();
                            motorbike[b++] = Motorbike;
                            break;
                        default:
                            System.out.println("Wrong choice");
                            break;
                    }selection1=y;
                    break;
                case 2:
                    System.out.println("\n\nCARS");
                    System.out.println("====");
                    for (y = 0; y < x; y++) {
                        System.out.println(y + 1);
                        car[y].get_values();
                    }
                    System.out.println("\n\nVANS");
                    System.out.println("====");
                    for (z = 0; z < c; z++) {
                        System.out.println(z + 1);
                        van[z].get_values();
                    }
                    System.out.println("\n\nMOTORBIKES");
                    System.out.println("==========");
                    for (a = 0; a < b; a++) {
                        System.out.println(y + 1);
                        motorbike[a].get_values();
                    }
                    break;
                case 3:
                    System.out.println("remove vehicle");
                    break;

                case 4:
                    System.out.println("Exit");
                    exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }


        }
    }}
