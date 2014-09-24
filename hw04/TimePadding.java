//Ryan Judge
//September 23
//hw 04 program 3
//This homework is designed to have us practice selection statements, comparison operators and Booleans

import java.util.Scanner; //new scanner

public class TimePadding { //declare class
    public static void main(String [] args) { //declare main method

    Scanner myScanner;
    myScanner = new Scanner( System.in ); //name new scanner
    
    System.out.println("Enter time in seconds ");
    boolean timeInt = myScanner.hasNextInt();
    double seconds = myScanner.nextDouble();
    double minutes = (seconds / 60);
    double hours = (minutes / 60);
    int inthours = (int) hours;
    minutes  = minutes - (inthours*60);
    int intminutes = (int) minutes;
    seconds = seconds - (intminutes*60) - (inthours*60*60);
    int intseconds = (int) seconds;
    String stringhour = Integer.toString(inthours);
    String stringminute = String.format("%02d", intminutes);
    String stringsecond = String.format("%02d", intseconds);
    
    if (timeInt = true){
        if (seconds > 0) {
             System.out.println( "" +stringhour+ ":" +stringminute+ ":" +stringsecond);
            
        }
        else{
        System.out.println("Not a positive time");
        return;
        }
    }
    else {
    System.out.println("Did enter an integer");
    return;
    }
    
            
    }
}