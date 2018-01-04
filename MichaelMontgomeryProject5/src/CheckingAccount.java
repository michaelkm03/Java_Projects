/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class CheckingAccount extends BankAccount {
    
    public CheckingAccount(String nameFirst, String nameLast, String ssn, float balance){
        super();
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.balance = balance;
        System.out.println("Successfully created account for " + this.nameFirst + " Account Number " + accountNum);
        System.out.println(this.nameFirst + " " + this.nameLast + " Balance " + this.balance);
        
        // Use Reg Ex to validate SSN param
        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        if(ssn.matches(regex)){
            this.ssn = ssn;
            System.out.println("good-----------");
        }
        else {
            System.out.println(this.ssn  + " is an invalid social security number");
        }
    }
    // Apply interest to balance    
    public void applyInterest(){
        this.balance = ((float)1.02 * (this.balance - 10000) + 10000);
        // System.out.println(this.nameFirst + " " + this.nameLast + " Balance " + this.balance);
    }
}
