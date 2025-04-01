/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Person.sample;

import com.example.Person.Person;

/**
 *
 * @author LENOVO
 */
public class Farmer extends Person {
  private  String farmLocation;

    public Farmer(String FarmLocation, String name, int age) {
        super(name, age);
        this.farmLocation = farmLocation;
    }

    public String getString() {
        return farmLocation;
    }

    public void setString( String farmLocation) {
        this.farmLocation = farmLocation;
    }

    @Override
    public String toString() {
        return "Farmer{" + "farmLocation=" + farmLocation + '}';
    }
    

        
    
    
    
}
