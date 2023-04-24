package edu.stevens.ece.ee552;

public class CoffeeMaker
{
    private int cupsWater;
    private int scoopsCoffee;
    private int cupsCoffee;
    
    private boolean isOn;
    
    public CoffeeMaker() { }
    
    public void addCoffee(int amount){
        this.scoopsCoffee += amount;
    }
    
    public void addWater(int amount){
        this.cupsWater += amount;
    }
    
    public void turnOn(){
        this.isOn = true;
    }
    
    public void brewCoffee(){
        this.cupsCoffee = this.cupsWater;
        this.cupsWater = 0;
        this.isOn = false;
    }
    
    public void pour(int numCups){
        if(this.cupsCoffee > 0){
            if(numCups > this.cupsCoffee){
                throw new IllegalStateException("not enough coffee");
            }
            this.cupsCoffee = this.cupsCoffee - numCups;
        }
    }

    public int getScoopsCoffee(){
        return this.scoopsCoffee;
    }

    public int getCupsCoffee(){
        return this.cupsCoffee;
    }

    public int getCupsWater(){
        return this.cupsWater;
    }
}