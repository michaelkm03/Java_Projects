/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Dog extends Animal {
    
    public Dog(String name){
        super(name);
    }
    
    @Override
    public void sound(){
        System.out.println(name + " sounds woof...woof");
    }
    
    @Override
    public void feed(){
        System.out.println(name + " eats bacon");
    }
}
