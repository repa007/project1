/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author repat
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Mavenproject1 {
    public static void main(String[] args) {
        GarageCar myGarage=new GarageCar(); //создаем новый гараж
        Car myCar1=new Car("Ford", 200,"Mustang",2,false, "A111AA"); //создаем легковую машину
        myGarage.addCar(myCar1); // добавляем ее в гараж 
        myGarage.addCar(new Car("LADA", 140, "Kalina", 4, false, "A777AA"));//добавляем еще одну машину 
        Truck myTruck=new Truck("Dove",160,"DTS",700,true, "Т123ТТ");//создаем грузовик 
        myGarage.addCar(myTruck); //добавляем его в гараж 
        myGarage.printGarage(); //выводи на экран содержимое гаража 
        if (myGarage.findCar(myCar1)) { //ищем машину 
            System.out.println("Да"); 
        } 
        else { 
            System.out.println("Нет"); 
        } 
    } 
    
    
}

