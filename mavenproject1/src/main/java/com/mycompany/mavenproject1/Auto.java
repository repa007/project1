/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author repat
 */
public class Auto { 
    private String firm; 
    private int maxSpeed;
    private String gosNumber;

    public void setFirm(String firma){
        firm=firma; 
    }

    public void setMaxSpeed(int speed){
        maxSpeed=speed; 
    }

    public int getMaxSpeed(){ 
        return maxSpeed;
    }

    public String getFirm(){
        return firm;
    }

    public void setGosNumber(String gosNumber){
        this.gosNumber = gosNumber;
    }

    public String getGosNumber(){
        return gosNumber;
    }

    public Auto(){
        firm="Без названия";
        maxSpeed=0;
    }

    public Auto(String firma, int speed, String gosNumber){
        firm=firma;
        maxSpeed=speed;
        this.gosNumber = gosNumber;
    }
} 

