
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
        
        // Create new Board
        GameBoard g = new GameBoard();
        GameBoard.displayBoard();
        
        // Play Game
        int score = 0;
        Scanner userChoice = new Scanner(System.in);
        String [] choices;
        System.out.println(" ========== Enter Choice in format x,y ========== \n\n");
        do {
            System.out.println(">  ");
             String line = userChoice.nextLine();
             choices = line.split(",");
             int x = choices[0];
             System.out.println(choices[1]);

        }
        while (userChoice.toString() != "quit");
        
    }
}
