/* SpeechFileDemo.Java
 * CSCI 112 - Spring 2014
 * 
 * This program reads data from a text file, then uses the FreeTTS Text to Speech 
 * API to have the computer speak the text.  It is intneded as a demo for a simple way to
 * include text to speech capability in a Java program.
 * 
 * last edited Feb. 13, 2014 by C. Herbert
 * 
 * For this code to work, the file "mary.txt" must be in the project folder. 
 * The FreeTTS library files must be included in the project's library. 
 * The quotes.txt file and the lib file must be packaged witrh the JAR file for 
 * distribution.
 * 
 * Two other text files -- quotes.txt and hamlet.txt are included in the project folder.
 * The code can be modified to try either one of these instead of mary.txt
 * 
 * This program has a method to read lines from a text into 
 * a String array, and a method to speak each String in the array.
 */
package speechfiledemo;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.util.Scanner;

public class SpeechFileDemo {
    
    public static void main(String[] args) throws Exception {
        
    String[] quotes = new String[200];  // an array to hold movie quotes
    int count;                          // the number of lines (array elements)    
               
        // call a method to read data into quotes[] line by line and return count
        count = readLines(quotes); 
        
        // call a method to speak thel ines in the array, one by one.
        speakLines(quotes, count);

    } // end main()
    
     public static int readLines(String[] lines) throws Exception
    {
        int count = 0; // number of array elements with data
        
        // Create a File class object linked to the name of the file to read
        java.io.File quotes = new java.io.File("mary.txt");

        // Create a Scanner named infile to read the input stream from the file
        Scanner infile  = new Scanner(quotes);
   
        /* This while loop reads lines of text into an array. it uses a Scanner class 
         * boolean function hasNextLine() to see if there another line in the file.
         */       
        while ( infile.hasNextLine() ) 
        {
            // read a line and put it in an array element
            lines[count] = infile.nextLine();
            count++;  // increment the number of array elements with data

        } // end while
        
        infile.close();
        return count;    // returns the number of items used in the array.
    
    } // end readLines()
/*************************************************/
    
    public static void speakLines(String[] lines, int count) {
        
        // instantiate a Voice object named voice
        Voice voice;
        
        // set up a VoiceManager object and use it to link voice with a particular voice
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("kevin16");
        
        // load the selected voice
        voice.allocate();

        // in a loop, say the lines
        for( int i = 0; i< count; i++)
        {
        System.out.println("line " + i + ": " + lines[i] );
        voice.speak(lines[i]);
        } // end for
       
    } // end speakLines()
}  // end class SpeechFileDemo
