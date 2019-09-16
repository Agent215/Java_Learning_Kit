/* EdisonSoundFrameDemo.java 
 * 
 * CSCI 112 - Spring 2014   last edited Feb 13, 2014 by C. Herbert
 * 
 * This program demonstrates the use of the Java Sound API's Javax.sound.sampled 
 * package to playback a digital audio file (also called a sampled audio file).
 * 
 * It is similar
 * For this prograsm to work, the file named in line 30, must be in the same 
 * directory as the jar file or project file. The original file it plays back is
 * an early recording of Edison reciting "Mary had a little lamb". * 
 */

package edisonsoundframedemo;

import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class EdisonSoundFrameDemo extends JFrame {

    /* To play sound using the Clip class, the process need to be alive. It is 
     * intended to run in an Applet or in a GUI application such as this.
     */
    // Constructor
    public EdisonSoundFrameDemo() {

        try {

            // identify the sound file as a File class object
            File soundFile = new File("edison.wav");

            // Create an AudioInputStream for the File object soundFile
            // This allows Java to read the file and read it as audio data in one step.
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

            // create an audio Clip object so we can use the Clip class methods 
            Clip myClip = AudioSystem.getClip();

            // open the myClip object and associate it with the audioIn AudioInputStream
            myClip.open(audioIn);

            // start playing the myClip audio Clip
            myClip.start();


        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }  // end catch

    } // end JavaSoundPlaybackDemo() 

    public static void main(String[] args) {

        // Instantiate a SoundPlaybackDemo object and set its properties. 
        // Remember, it is a Jframe object(a JFrame sub-class object).
         
        EdisonSoundFrameDemo soundFrame = new EdisonSoundFrameDemo();
        soundFrame.setTitle("Sound clip playback demo");
        soundFrame.setSize(300, 200);
        soundFrame.setLocation(200, 100);
        soundFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // activate the JavaSoundPlaybackDemo object
        // no sound will be heard unless the JFrame is activated
        soundFrame.setVisible(true);

    } // end main()
} //end class JavaSoundPlaybackDemo
