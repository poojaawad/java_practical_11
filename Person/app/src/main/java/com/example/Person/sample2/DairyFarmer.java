/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Person.sample2;

import com.example.Person.sample.Farmer;

/**
 *
 * @author LENOVO
 */
public class DairyFarmer extends Farmer {
     private int numberOfCows;
      private double milkProduction;

    public DairyFarmer(int numberOfCows, double milkProduction, String FarmLocation, String name, int age) {
        super(FarmLocation, name, age);
        this.numberOfCows = numberOfCows;
        this.milkProduction = milkProduction;
    }

    
    public int getNumberOfCows() {
        return numberOfCows;
    }

    public void setNumberOfCows(int numberOfCows) {
        this.numberOfCows = numberOfCows;
    }

    public double getMilkProduction() {
        return milkProduction;
    }

    public void setMilkProduction(double milkProduction) {
        this.milkProduction = milkProduction;
    }

    @Override
    public String toString() {
        return "DairyFarmer{" + "numberOfCows=" + numberOfCows + ", milkProduction=" + milkProduction + '}';
    }
      
    
    
}
