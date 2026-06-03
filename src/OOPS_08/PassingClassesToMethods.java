package OOPS_08;

import java.util.Scanner;

public class PassingClassesToMethods {
    public static class Car{
        int seat;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(name+" "+seat+" "+length+" "+type+" "+torque);
        }

    }
    public static void main(String args[]) {
        Car c =  new Car();
        c.length = 3.99;
        c.name = "Range Rover";
        c.seat = 6;
        c.length = 178;
        c.type = "SUV";

        change(c);
        System.out.println(c.seat);
        c.print();
    }
    public static void change(Car c){
        c.seat = 4;
    }
}
