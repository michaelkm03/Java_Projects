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
    protected String nameFirst;
    protected String nameLast;
    private String ssn;
    
    public Customer(String nameFirst, String nameLast, String ssn){
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.ssn = ssn;
    }

    // Getters
    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public String getSsn() {
        return ssn;
    }

    // Setters 
    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    
    
    
}
