
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class BankDatabase {
        
    private BankAccount [] accounts = new BankAccount[100];
    int count = 0;
    
    BankDatabase(){};

    
    public void openAccount(String type, Customer customer, float deposit){
        
        switch(type.toLowerCase()){
            case "checking":
                accounts[count] = new CheckingAccount((customer.getFullName()));
                
                count++;
                break;
                
            case "saving":
                accounts[count] = new SavingsAccount(customer.getFullName());
        }
    }
    
    // Method to print out current array contents
    public void print(){
      
    }
    
    public void applyInterest(){
        
    }

}

