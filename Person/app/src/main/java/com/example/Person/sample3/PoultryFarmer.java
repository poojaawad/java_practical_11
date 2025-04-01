/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Person.sample3;

import com.example.Person.sample.Farmer;

/**
 *
 * @author LENOVO
 */
public class PoultryFarmer extends Farmer {
    int numberOfHens;
    int eggProduction;

    public PoultryFarmer(int numberOfHens, int eggProduction, String FarmLocation, String name, int age) {
        super(FarmLocation, name, age);
        this.numberOfHens = numberOfHens;
        this.eggProduction = eggProduction;
    }

    @Override
    public String toString() {
        return "PoultryFarmer{" + "numberOfHens=" + numberOfHens + ", eggProduction=" + eggProduction + '}';
    }

    public int getNumberOfHens() {
        return numberOfHens;
    }

    public void setNumberOfHens(int numberOfHens) {
        this.numberOfHens = numberOfHens;
    }

    public int getEggProduction() {
        return eggProduction;
    }

    public void setEggProduction(int eggProduction) {
        this.eggProduction = eggProduction;
    }
    
    
    
}
