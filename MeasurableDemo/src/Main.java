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
    public static void main(String[] args){
        
        Measurable[] accounts = {
            new BankAccount(1000),
            new BankAccount(2000), 
            new BankAccount(500)
        };
        
        Measurable[] countries = { 
            new Country("US", 10000), 
            new Country ("France", 2000), 
            new Country ("China", 5000)
        };
}
