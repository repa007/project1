package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author repat
 */
import java.util.ArrayList;

public class GarageCar {
    
    private ArrayList<Auto> masCar=new ArrayList<Auto>();

    public void addCar(Auto m){
        masCar.add(m);
    }

    public Boolean RemoveCar(Auto m){
        return masCar.remove(m);
    }
    
    public GarageCar (){
    }

    public Boolean findCar(Auto m){
        return masCar.contains(m);
    }
    
    public GarageCar(ArrayList< Auto> n){
        masCar=n;
    } 

    public void printGarage() { 
        System.out.println("В гараже: "); 
        for (Auto a:masCar){
            System.out.println("\t"+a.toString());
        }
    }
}
