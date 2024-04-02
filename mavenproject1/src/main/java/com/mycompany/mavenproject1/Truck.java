/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author repat
 */
import java.util.Scanner; 

import java.util.Scanner;
public class Truck extends Auto{

    private String model; private int
    power; private Boolean trailer;

    public Truck(){
        super();
        model="";
        power=0;
        trailer=false;
    }
    public Truck(String firma, int speed, String name, int n, Boolean f, String gosNumber){
        super(firma,speed, gosNumber);
        model=name;
        power=n;
        trailer=f;
    }

    public void setModel(String name){
        model=name;
    }

    public String getModel(){
        return model;
    }

    public void setPower(int n){
        power=n;
    }

    public int getPower(){
        return power;
    }

    public void setTrailer(Boolean b){
        trailer=b;
    }

    public Boolean isTrailer(){
        return trailer;
    }

    public void setAllInfo(){ 
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фирму-производитель грузового авто: ");
        String nazv=in.next(); //метод next() позволяет вводить строки, но без
        setFirm(nazv);
        System.out.print("Введите максимальную скорость грузовогоавто: "); 
        int s=in.nextInt();
        setMaxSpeed(s);
        System.out.print("Введите модель грузового авто: ");
        model=in.next();
        System.out.print("Введите мощность грузового авто: ");
        power=in.nextInt();
        System.out.print("Введите признак прицепа грузового авто (true/false):"); 
        trailer=in.nextBoolean();
        System.out.println();
        in.close();
    }

    public String toString(){ 
        return "\n\tГрузовик:"+"\n\t"+"Фирма: "+getFirm()+"\n\t"+"Максимальная скорость: "+getMaxSpeed()+ "\n\t"+"Модель: "+model+"\n\t"+"Мощность: "+power+"\n\t"+"Признак прицепа: " +trailer+"\n\t" + "Гос номер: " + getGosNumber() + "\n";
    }
} 

