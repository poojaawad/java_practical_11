/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Person;

import com.example.Person.sample1.CropFarmer;
import com.example.Person.sample2.DairyFarmer;
import com.example.Person.sample3.PoultryFarmer;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args){
        CropFarmer f1= new CropFarmer("Seasonal",4.5,"Daithana","Ramesh",40);
        System.out.println(f1);
        DairyFarmer f2=new DairyFarmer(12,50,"pokharni","Suresh",38);
        System.out.println(f2);
        PoultryFarmer f3=new PoultryFarmer(20,40,"Gangakhed","Yash",35);
        System.out.println(f3);
        
    }
}
