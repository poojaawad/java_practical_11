/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Person.sample1;

import com.example.Person.sample.Farmer;

/**
 *
 * @author LENOVO
 */
public class CropFarmer extends Farmer {
     private String cropType;
     private double landSize;

    public CropFarmer(String cropType, double landSize, String FarmLocation, String name, int age) {
        super(FarmLocation, name, age);
        this.cropType = cropType;
        this.landSize = landSize;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public double getLandSize() {
        return landSize;
    }

    public void setLandSize(double landSize) {
        this.landSize = landSize;
    }

    @Override
    public String toString() {
        return "CropFarmer{" + "cropType=" + cropType + ", landSize=" + landSize + '}';
    }
     
    
    
}
