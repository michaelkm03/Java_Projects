
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class BoatsInventory {
    
    String FILENAME = "Boats.txt";
    
    ArrayList<RaceBoat> boatObjects = new ArrayList<RaceBoat>();
    int boatCount = 0;

    // Create reader objects, initialized to null
    BufferedReader bufferReader = null;
    FileReader fileReader = null;
        
    // Initialize BoatsInventory object
    public BoatsInventory(){
            
        // Try opening file, reading through
        try {
            fileReader = new FileReader(FILENAME);
	    bufferReader = new BufferedReader(fileReader);

            String sCurrentLine;

            //bufferReader = new BufferedReader(new FileReader(FILENAME));
                
            while ((sCurrentLine = bufferReader.readLine()) != null) {
                RaceBoat r = new RaceBoat(sCurrentLine);
                boatObjects.add(r);
                boatCount++;
            }
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void inventoryData(RaceBoat boatObjects){
        for (RaceBoat boat : this. boatObjects) {   
                System.out.println(boat.boatName);
            }
    }
    
    public ArrayList<RaceBoat> getBoatObjectName() {
        return this.boatObjects;
    }

   
}
