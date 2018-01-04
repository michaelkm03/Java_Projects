/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author michaelmontgomery
 */

// Create Main BankAccount superclass with vars, protected
public abstract class BankAccount {
    protected int accountNum;
    protected float deposit;
    protected float withdrawl;
    protected float interest;
    protected float balance;
    protected String nameFirst;
    protected String nameLast;
    protected String ssn;
    

    // Bank Account constructor with rand int account num
    public BankAccount(){
        Random rand = new Random();
        this.accountNum = rand.nextInt(999999999) + 1;
        this.balance = 0;
    }
    
    // Take float parm to make deposit
    public void deposit(float deposit){
        this.balance = (balance + deposit);
        System.out.println(this.nameFirst + " " + this.nameLast + " deposited " + deposit + ".  Current Balance is " + this.balance);
    }
     
    // Withdraw float amount from current object balance
    public void withdraw(float withdrawl){
        if (withdrawl > balance) {
            System.out.println("Unable to withdraw " + withdrawl + " for " + this.nameFirst + " " + this.nameLast + " due to insufficient funds");
        } else 
        {
            this.balance = (this.balance - withdrawl);
            System.out.println(this.nameFirst + " " + this.nameLast + " withdrew " + withdrawl + ".  Current Balance is " + this.balance);
        }
    }
    
    // Check balance of current object
    public void checkBalance(){
        System.out.println(this.nameFirst + " " + this.nameLast + " " + this.balance);
    }
    
    public abstract void applyInterest();
}