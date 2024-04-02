package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author repat
 */
public class testGarage {
    public static void main(String[] args) {
        GarageCar myGarage=new GarageCar();
        Car myCar1=new Car("Ford", 200,"Mustang",2,false, "A123AA"); 
        myGarage.addCar(myCar1); 

        myGarage.addCar(new Car("LADA", 140, "Kalina", 4, false, "A123AA"));
        Truck myTruck=new Truck("Dove",160,"DTS",700,true, "A123AA");//создаем
        myGarage.addCar(myTruck); 
        myGarage.printGarage();

        if (myGarage.findCar(myCar1)) { 
            System.out.println("Да"); 
        }
        else {
            System.out.println("Нет");
        }

        myGarage.RemoveCar(myCar1);

        myGarage.printGarage();

        if (myGarage.findCar(myCar1)) { 
            System.out.println("Да"); 
        }
        else {
            System.out.println("Нет");
        }
    }
}

