/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class FileSizeTooLargeException extends Exception{
    
    private String filename;
    private long fileSize;
    
    public FileSizeTooLargeException(String filename, long fileSize)
    {
        this.filename = filename;
        this.fileSize = fileSize;
    }
    
    @Override
    public String getMessage()
    {
        return filename + " size " + fileSize + " bytes";
    }
    
}
