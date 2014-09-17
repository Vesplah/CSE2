//Ryan Judge
//September 16
//hw03 Program 1
//This Hw is designed to help me practice writing code that allows users to input information

import java.util.Scanner;

public class Bicycle { //define a class
    public static void main(String[] args) { //main method for a program
    
Scanner myScanner;
    myScanner = new Scanner(System.in);
    
 //constants needed for calculations   
          double wheelDiameter=27.0; //
          double PI=3.14159; //
          double feetPerMile=5280; //
          double inchesPerFoot=12; //
          double secondsPerMinute=60; //
          
          //declare variables
          double totalMinutes;
          double totalHours;
          double countsTrip;
          double tripdistance;
          double AvgMph;
          double tripTime;
          


    
System.out.print("Enter the number of seconds: ");// ask for input on time in seconds
    double bikeSeconds = myScanner.nextDouble(); //accept user input
System.out.print("Enter the number of counts: "); //ask for input on rotations
    double bikeCounts = myScanner.nextDouble(); //accept user input

totalMinutes = bikeSeconds/60;
totalHours = totalMinutes/60;
tripdistance = PI*wheelDiameter*bikeCounts;
tripdistance/= inchesPerFoot*feetPerMile;
AvgMph = tripdistance/totalHours;
tripTime = tripdistance*secondsPerMinute/AvgMph;


tripdistance = Math.round(tripdistance*100.0)/100.0; //total distance traveled
AvgMph = Math.round(AvgMph*100.0)/100.0; //average speed

System.out.println("The distance was " +tripdistance+ " miles and took " +tripTime+ " minutes" );
System.out.println("The average mph was " +AvgMph+ " miles per hour");
    
    }
}