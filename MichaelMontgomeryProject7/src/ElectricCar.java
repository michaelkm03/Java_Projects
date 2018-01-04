/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class ElectricCar implements Controllable{
    
    boolean isON;
    int direction;
    int speed;
    
    public ElectricCar(){
        isON = false;
        direction = 360;
        speed = 0;
    }
//  This method sets a flag to indicate the car is powered on
    @Override
    public void powerOn (){
        this.isON = true;
    }
 
//  This method sets a flag to indicate the car is powered off.
    @Override
    public void powerOff (){
        this.isON = false;
    }
 
//  Turns the car by 5 degrees to the right.
    @Override
    public void turnRight(){
        this.direction = (direction + 5);
    }
 
//  Turns the car by 5 degrees to the left
    @Override
    public void turnLeft(){
         this.direction = (direction - 5);

    }
 
//  Commands the car to move forward and increase the car speed by 2 mph.  
    @Override
    public void goFaster (){
        this.speed = (this.speed + 2);
    }
 
// Commands the car to reduce the speed by 2 mph.
    @Override
    public void slowDown (){
        this.speed = (this.speed - 2);
    }

 // Override this method to output the car information.
    @Override
    public String toString(){
        if (this.isON = true && this.speed != 0) {
         return "car travels in " + this.direction + " at the speed of " + this.speed + " mph";   
        }
        
        else if (this.isON = true && this.speed == 0) {
            return "car is stopped";
        }
        
        else if (this.isON = false) {
            return "car is powered off "; 
        }
        
        else {
            return "there was a problem";
        }
    }

}
