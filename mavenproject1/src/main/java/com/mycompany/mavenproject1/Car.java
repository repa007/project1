/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author repat
 */
public class Car extends Auto{
    private String model;
    private int numDoors; private
    Boolean fullTime; 

    public Car(){ super();
        numDoors=4;
        fullTime=false;
    }
    
    public Car(String firma, int speed, String name, int n, Boolean f, String gosNumber){
        super(firma,speed, gosNumber);  
        model=name; 
        numDoors=n; fullTime=f;
    }

    public void setModel(String name){
        model=name;
    }

    public String getModel(){
        return model;
    }

    public void setNumDoors(int n){
        numDoors=n;
    }

    public int getNumDoors(){
        return numDoors; 
    }

    public void setFullTime(Boolean b){
        fullTime=b;
    }

    public Boolean isFullTime(){
        return fullTime;
    }

    public String toString(){
        return getFirm()+" "+getMaxSpeed()+" "+model+" "+numDoors+" "+fullTime + " " + getGosNumber();
    }
} 