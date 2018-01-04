
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args)
    {
        
        String[] filenames = {"test.txt", "image.jpg"};
        
        ArrayList<FileHandler> handlers = new ArrayList<FileHandler>();
        
        for (String filename : filenames)
        {
            try
            {
                FileHandler fh = new FileHandler(filename);
                handlers.add(fh);
            }
            catch(FileSizeTooLargeException e)
            {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        
        for (FileHandler fh : handlers)
        {
            System.out.println("Valid file " + fh.getFilename() 
                    + " size " + fh.getFileSize() + " bytes");
        }
            
        
    }
}
