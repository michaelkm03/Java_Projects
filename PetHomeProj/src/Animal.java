/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public abstract class Animal {
    String name;
    
    public Animal(String name){
        this.name = name;
    }
    
    abstract public void sound();
    abstract public void feed();
    
}
