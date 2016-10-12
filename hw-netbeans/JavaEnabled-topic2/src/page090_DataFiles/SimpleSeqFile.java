/*
 * SimpleSeqFile.java
 * Created on May 21, 2008, 1:44 PM
 */

package page090_DataFiles;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader; 

import java.io.IOException;
import java.io.FileNotFoundException;

import ibio.IBIO;

/**
 * Writes and reads a sequential file.
 * @author MHayes
 * @version May 2008
 */
public class SimpleSeqFile {
    
    private VideoStore[] x;
    /**
     *  @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Default location of files is root folder of Netbeans project.
        String filename = "test.txt";           
        
        // Prompt the user for their name
        String userName = IBIO.input("What is your name? ");                

        // Open the file in append mode. Creates a new one if it does not exist.
        try {
            FileWriter fw = new FileWriter(filename, true);    // Can throw IOException

            PrintWriter outFile = new PrintWriter(fw);

            // Write the userName to the file.
            outFile.println(userName);

            // Close the file.
            outFile.close();
        }
        catch (IOException e) {
            IBIO.output("Error opening file for writing: " + e);
            System.exit(0);
        }
        
        // Read the file        
        try {
            // Open the file to read it.
            FileReader fr = new FileReader(filename);   // Can throw FileNotFoundException
            
            // Create a buffered reader
            BufferedReader inFile = new BufferedReader(fr);
            
            // Read the data. EOF (end of file) is indicated by null.
            String record = null;
            record = inFile.readLine();        // Read the first record 
            while (record != null)
            {
                IBIO.output(record);
                record = inFile.readLine();    // Read the next record until EOF                
            } 
            
            // Close the file
            inFile.close();                     
        }
        catch (FileNotFoundException e) {
            // Opening the file may cause this error.
            IBIO.output("Error opening file for reading: " + e);
            System.exit(0);            
        }
        catch (IOException e) {
            // Reading or closing may cause this error.
            IBIO.output("Error reading or closing file: " + e);
            System.exit(0);            
        }                                  
    }    
}



