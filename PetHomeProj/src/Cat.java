/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Cat extends Animal{
    
    public Cat(String name){
       super(name);
    }
    
    @Override
    public void sound(){
        System.out.println(name + " sounds mew...mew");
    }
    
    @Override
    public void feed(){
        Systm.out.println(name + " eats cat food");
    }
}
