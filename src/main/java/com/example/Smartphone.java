package com.example;

// TODO: make this class extend ElectronicDevice

public class Smartphone extends ElectronicDevice{
    // TODO: Declare the necessary attributes (brand, model, batteryLevel)
    // private String brand;
    // private String model;
    private int batteryLevel;

    // Constructor to initialize the Smartphone object
    public Smartphone(String brand, String model, int batteryLevel) {
        // TODO: Initialize the attributes with the provided parameters
        // this. brand = brand;
        // this. model = model;
        super(brand, model);
        this. batteryLevel = batteryLevel;
    }

    public int getBatteryLevel(){
        return this. batteryLevel;
    }
    public void setBrand (int batteryLevel){
        this.batteryLevel = batteryLevel;
    }

    // TODO: Implement a method to check the battery level and return a message based on the level
    // Implement the checkBattery method to return:
        // "Warning: Battery low!" if the battery level is 20% or lower.
        // "Battery level is okay: [batteryLevel]%." if the battery level is above 20%.
    public void checkBattery(){
        if (batteryLevel<20){
            System.out.println("Warning: Battery low!"); 
        }
        else{
            System.out.println("Battery level is okay:"+batteryLevel+"%");
        }
    }

    // TODO: Implement necessary getters for the attributes

    // OPTIONALLY implement the required methods to pass the BonusTest.

}
