/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Main {
    public static void main(String[] args) {    

    Controllable toy = new ElectricCar();
    

     toy.powerOn();

     toy.goFaster();

     toy.turnLeft();

     System.out.println(toy);

     toy.turnLeft();

     System.out.println(toy);

     toy.slowDown();

     System.out.println(toy);   

     toy.powerOff();

     toy.turnRight();

     System.out.println(toy);    

 }
    
}