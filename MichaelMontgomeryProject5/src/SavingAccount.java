/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class SavingAccount extends BankAccount{
    
    public SavingAccount(String nameFirst, String nameLast, String ssn, float balance){
        super();
        this.accountNum = accountNum;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.ssn = ssn;
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
            System.out.println("Successfully created account for " + this.nameFirst + this.nameLast + ". Inavlid SSN!");
            this.ssn = " ";
        }
    }
    
    // Apply interest to balance
    public void applyInterest(){
        this.balance = (balance * (float)1.05) + balance;
        // System.out.println("New Balance:  " + this.balance);
    }
}
