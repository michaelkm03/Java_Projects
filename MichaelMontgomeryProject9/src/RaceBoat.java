/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class RaceBoat implements Commands {
    
    String boatName = null;
    boolean boatPower;
    int boatSpeed = 0;
    int boatDirection = 360;
    int acceleration = 2;
    int degree = 5;
    
    public RaceBoat(String boatName){
        this.boatName = boatName;
        //System.out.println("Made " + this.boatName);
    }
    
    @Override
    public void powerOn(){
        if (this.boatPower == false){
            this.boatPower = true;
        }
        
        else {
            System.out.println("Boat is already on...");
        }
    }
    
    @Override
    public void powerOff(){
        if (this.boatPower == true){
            this.boatPower = false;
        }
        
        else {
            System.out.println("Boat is already off...");
        }
    }
    
    @Override
    public void speedUp(){
        if (this.boatPower == true){
            this.boatSpeed += acceleration;
        }
        
        else {
            System.out.println("Boat is off, cannot increase speed...");
        }
    }
    
    @Override
    public void slowDown(){
        if (this.boatPower == true){
            this.boatSpeed -= acceleration;
        }
        
        else {
            System.out.println("Boat is off, cannot decrease speed...");
        }
    }
    
    @Override
    public void turnRight(){
        this.boatDirection += degree;
    }
    
    @Override
    public void turnLeft(){
        this.boatDirection -= degree;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("=====================================");
        System.out.println("POWER:          " + this.boatPower);
        System.out.println("Boat Name:      " + this.boatName);
        System.out.println("Speed:          " + this.boatSpeed);
        System.out.println("Direction:      " + this.boatDirection);
        System.out.println("=====================================");
    }

    public String getBoatName() {
        return boatName;
    }
}