/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Poodle extends Dog {
    
    public Poodle(String name){
        super(name);
    }
    
    public void attitude(){
        System.out.println(name + " is grumpy");
    }
}
