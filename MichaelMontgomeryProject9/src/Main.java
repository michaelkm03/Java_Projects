
import java.util.Scanner;

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
        
        BoatsInventory b = new BoatsInventory();
        String userInput = null;
        Scanner s = new Scanner(System.in);
        int i = 0;
                
        System.out.println("\n================================================================================");
        System.out.println("\n   Select Boat and Command from Below    ||     Enter 'QUIT' to exit program    \n");
        System.out.println("=================================================================================");
        System.out.println("\n[  BOATS  ]\n");
        for (int boats = 0; boats < b.boatObjects.size();boats++){
            System.out.println(">  " + b.boatObjects.get(boats).boatName);
        }        
        System.out.println("\n[ COMMANDS ]\n");
        System.out.println("> powerOn");
        System.out.println("> powerOff");
        System.out.println("> speedUp");
        System.out.println("> slowDown");
        System.out.println("> turnRight");
        System.out.println("> turnLeft");
        System.out.println("\n=================================================================================\n");
        
        do {
            i = 0;
            System.out.print("Enter Here:    ");
            System.out.println("\n=================================================================================\n\n");
            userInput = s.nextLine();
            if (userInput.equals("QUIT") || userInput.equals("Quit") || userInput.equals("quit")){
                System.out.println("\n\n=======================================================================\n");
                System.out.println("Quitting program now............");
                System.out.println("\n=======================================================================");
                System.exit(i);
            }

            String boat = userInput.substring( 0, userInput.indexOf(","));
            String command = userInput.substring(userInput.indexOf(",")+1, userInput.length());      
            command = command.trim();
                
            for (i = 0; i < b.boatObjects.size();i++){
                if ((b.boatObjects.get(i).boatName).equals(boat)){
                    switch (command) {
                        case "powerOn":
                            b.boatObjects.get(i).powerOn();
                            b.boatObjects.get(i).displayInfo();
                            break;
                        case "powerOff":
                            b.boatObjects.get(i).powerOff();
                            b.boatObjects.get(i).displayInfo();
                            break;
                        case "speedUp":
                            b.boatObjects.get(i).speedUp();
                            b.boatObjects.get(i).displayInfo();
                            break;
                        case "slowDown":
                            b.boatObjects.get(i).slowDown();
                            b.boatObjects.get(i).displayInfo();
                            break;
                        case "turnRight":
                            b.boatObjects.get(i).turnRight();
                            b.boatObjects.get(i).displayInfo();
                            break;
                        case "turnLeft":
                            b.boatObjects.get(i).turnLeft();
                            b.boatObjects.get(i).displayInfo();
                            break;
                        }
                    }
                }
        }
        while (!(userInput.equals("QUIT")));
    }
}