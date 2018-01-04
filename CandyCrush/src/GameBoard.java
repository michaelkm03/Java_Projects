
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class GameBoard {
    
    static final int MAX_ROW_LENGTH = 25; 
    static final int MAX_COLUMN_LENGTH = 25;
    static int totalPointsOnBoard = 0;
    public static Piece[][] board = new Piece[MAX_ROW_LENGTH][MAX_COLUMN_LENGTH];   
    
    // Randomly generate pieces
    public static Random rand = new Random();
    public static int piece_01 = rand.nextInt((MAX_ROW_LENGTH*MAX_COLUMN_LENGTH)) + 1;
    public static int piece_02 = rand.nextInt(((MAX_ROW_LENGTH*MAX_COLUMN_LENGTH)) - piece_01) + 1;;
    public static int piece_03 = ((MAX_ROW_LENGTH*MAX_COLUMN_LENGTH) - (piece_02 + piece_01));;
    
    public GameBoard() {
        
        // GameBoard constuctor.  Randomly place pieces in switch statement
        for (int row = 0; row < MAX_ROW_LENGTH; row++){
            for (int col = 0; col < MAX_COLUMN_LENGTH; col++){ 
                Random rPos = new Random();
                int oddsPiece = rPos.nextInt(3) + 1;
                switch (oddsPiece) {
                    case 1: if (piece_01 != 0){
                        Piece rPiece = new RedPiece(); 
                        board[row][col] = rPiece;
                        totalPointsOnBoard += rPiece.pieceValue;
                    }
                    break;
                    case 2:  if (piece_02 != 0){
                        Piece bPiece = new BluePiece();
                        board[row][col] = bPiece;
                        totalPointsOnBoard += bPiece.pieceValue;
                    }
                    break;
                    case 3:  if (piece_03 != 0){
                        Piece yPiece = new YellowPiece(); 
                        board[row][col] = yPiece;
                        totalPointsOnBoard += yPiece.pieceValue;
                    }
                    break;
                    default: col--;
                    break;
                }
            }
        }
    }
    
    public void getIndexObj(int x, int y){
        System.out.println(board[x][y].pieceSymbol);
    }
    
    public static void displayBoard(){
        for (int row = 0; row < MAX_ROW_LENGTH; row++){
            for (int col = 0; col < MAX_COLUMN_LENGTH; col++){
                System.out.print("| " + board[row][col].pieceSymbol + " |");
                if (col == (MAX_COLUMN_LENGTH - 1)){
                    System.out.println("\n");
                }
            }
        }
        System.out.println("============ BANK ============");
        System.out.println("Red Pieces:          " + piece_01);
        System.out.println("Blue Pieces:         " + piece_02);
        System.out.println("Yellow Pieces:       " + piece_03);
        System.out.println("TOTAL PIECES:        " + (piece_01 + piece_02 + piece_03));
        System.out.println("TOTAL POINTS:        " + totalPointsOnBoard);
        System.out.println("==============================");

    }
}