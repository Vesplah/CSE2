  
  //Ryan Judge
  //CSE02 
  // September 5th 2014
  // Program will count the distamce, counts and timem for trips
 
  //define class
  public class Cyclometer{
      
      // add main method for every java program
      public static void main(String[] args) {
          
          //initializing variables
          
          int secsTrip1=480; //
          int secsTrip2=3220; //
          int countsTrip1=1561; //
          int countsTrip2=9037; //

          //useful constants and storing distances
          double wheelDiameter=27.0; //
          double PI=3.14159; //
          double feetPerMile=5280; //
          double inchesPerFoot=12; //
          double secondsPerMinute=60; //
          double distanceTrip1, distanceTrip2,totalDistance; //

// print varibales 
    System.out.println("Trip 1 took "+
(secsTrip1/secondsPerMinute)+" minutes and had "+
countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
(secsTrip2/secondsPerMinute)+" minutes and had "+
countsTrip2+" counts.");

//Distances
distanceTrip1=countsTrip1*wheelDiameter*PI; //distance in inches
distanceTrip1/=inchesPerFoot*feetPerMile; //distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
totalDistance=distanceTrip1+distanceTrip2;

System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");
          
          
          
    
          
          
      }// end main methid
  }// end class
  