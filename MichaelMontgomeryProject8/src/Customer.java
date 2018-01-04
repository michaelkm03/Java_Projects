/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Customer {
    private String fullName;
    private final String ssn;
    
    public Customer(String nameFirst, String nameLast, String ssn){
        this.ssn = ssn;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSsn() {
        return ssn;
    }
    
    public Customer (String name, String ssn){
        String [] fullname = name.split(" ");
        
        firstName = fullname[0];
        
        
    }
    
    
}
