
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class FileHandler {
    private String filename;
    private final static int MAX_FILE_SIZE = 1000; //bytes
    private long fileSize = 0;
    
    public FileHandler(String filename) 
            throws FileSizeTooLargeException
    {        
        this.filename = filename;
        File f = new File(filename);
        
        fileSize = f.length();
        
        if (fileSize > MAX_FILE_SIZE)
        {
            FileSizeTooLargeException e = 
                    new FileSizeTooLargeException(filename, fileSize);
            throw e;
        }
        
    }
    
    public long getFileSize()
    {
        return fileSize;
    }
    
    public String getFilename()
    {
        return filename;
    }
    
}
