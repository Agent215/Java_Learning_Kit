/* SunAudioDemo.java 
 * 
 * CSCI 112 - Spring 2014
 * 
 * This program demonstrates the use of the now deprecated Sun Audio API to 
 * play back an audio file.  It will work with .wav, .au and .aiff files.
 * 
 * For this prograsm to work, the file named in line 23, must be in the same 
 * directory as the jar file or project file. The original file it plays back is
 * an early recording of Edison reciting mary had a little lamb.
 * 
 */

package sunaudiodemo;

import sun.audio.*;    //import the sun.audio package
import java.io.*;

public class SunAudioDemo {
    public static void main(String[] args) throws Exception {

        // identify the sound file as a File class object
        File soundFile = new File("edison.wav");

        // Open an input stream for the File object soundFile
        // This allows Java to read the file.
        InputStream inFile = new FileInputStream(soundFile);
        
        // Create an AudioStream from the input stream.
        // This tells Java to read the incoming data as sound data.
        AudioStream audio = new AudioStream(inFile);
        
        // play the sound file using the start method from Audioplayer.player
        AudioPlayer.player.start(audio);

    } // end main()
} // end class SunAudioDemo
