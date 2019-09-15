/*CelsiusTemp.java
*Console I/O dialog calculating a cities temp in fahrenheit and celcius
*for CSCI 111 
*last edited september 19th 2:48 pm
 */
package celsiuscalculator;

import javax.swing.JOptionPane;

public class CelsiusCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Variables
        String cityname; // city name
        double tempCelsius; // temperature in celsius as a double data type
        double tempFahrenheit; // temperature in fahrenheit
        String celsiusString; // temperature in celsius as a string data type

//Say hello to user and ask for city name
        cityname = JOptionPane.showInputDialog("Hello! What city is the user in? ", "Enter city name");

//ask for current temp in celcius 
        celsiusString = JOptionPane.showInputDialog("What is the temperature in " + cityname + " in celsius : ");
        tempCelsius = Double.parseDouble(celsiusString);

// caculate temp in farinheight
        tempFahrenheit = tempCelsius * (9.0 / 5.0) + 32.0;

// print results city temp in both celcius and farinheight
        JOptionPane.showMessageDialog(null, "The current temperature in " 
                + cityname + " is " + tempCelsius + "\u00b0C, which is " 
                + tempFahrenheit + "\u00b0F", "Temperature", 
                JOptionPane.PLAIN_MESSAGE);

    } // end main

}
