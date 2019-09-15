
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtrip;
import java.util.*;
/**
 *
 * @author Chuck
 */
public class RoadTrip {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) 
{
	double distance; // Distance traveled in miles
	double time; 	// Total driving time in 
	double fuel;	// total fuel used in gallons
	double speed;	// average speed – miles per hour MPH
	double mileage;	// mileage - average miles per gallon MPG

	// declare an instance of Scanner to read the datastream from the keyboard.
	Scanner keyboard = new Scanner(System.in);

	// get Distance in miles from the keyboard
	System.out.println("Please enter the distance (miles): " );  
	distance = keyboard.nextDouble(); 

	// get Driving time in hours
  	System.out.println("Please enter the total driving time (hours): " );  
	time = keyboard.nextDouble(); 

	// get Fuel used in gallons
  	System.out.println("Please enter the total fuel used (gallons): " );  
	fuel = keyboard.nextDouble(); 

	// calculate Average speed (MPH)
	speed = distance / time;

        // Calculate Fuel mileage (MPG)
	mileage = distance / fuel;

	// print results - distance and time, MPH and MPG
	System.out.println("You traveled "+ distance + " miles in " + time +" hours");  
	System.out.println("Your average speed was "+ speed + " MPH." );  
	System.out.println("Your mileage was "+ mileage + " MPG." );  
        

} // end main()

}
