/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**     


 *
 * @author michaelmontgomery
 */
public class BankMain {
    public static void main(String[] args){

        BankDatabase db = new BankDatabase();
        Customer alin = new Customer("Alin Parker", "123-45-6789");
        Customer mary = new Customer("Mary Jones","987-65-4321");
        Customer john = new Customer("John Smith", "123-45-6789");
        db.openAccount("Checking", alin, 2000.0f);
        db.openAccount("Saving", mary, 15000.0f);
        db.openAccount("Saving", john, 12000.0f);
        db.print();

    }
}
