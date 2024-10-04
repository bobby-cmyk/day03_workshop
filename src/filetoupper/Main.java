package filetoupper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) 
            throws FileNotFoundException, IOException{
        
        // Get file path 
        File file = new File(args[0]);
        
        // Start inputs
        FileReader fReader = new FileReader(file);

        BufferedReader bReader = new BufferedReader(fReader);
            
        // Instantiate a file to write with fileWriter
        FileWriter fWriter = new FileWriter("upppercatinthehat.text");

        BufferedWriter bWriter = new BufferedWriter(fWriter);
        

        // Should maybe set up a file writer, so it will the buffered reader will read one line, turns it to uppercase, and then read that one line into the file writer
        while (true) {

            //Read line and transform to upper

            String line = bReader.readLine();
            
            if (null == line)
                break;
            
            String lineUpper = line.toUpperCase();

            // Change this to 
            System.out.println(lineUpper);
            bWriter.write(lineUpper);
            bWriter.newLine();
    
        }

        bReader.close();
        bWriter.close();
        
    }

    
}