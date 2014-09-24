//Ryan Judge
//September 23
//hw 04 program 2
//This homework is designed to have us practice selection statements, comparison operators and Booleans

import java.util.Scanner; //new scanner

public class Month { //declare class
    public static void main(String [] args) { //declare main method

Scanner myScanner;
    myScanner = new Scanner( System.in ); //name new scanner
    
System.out.print("Enter an int giving the number of the month (1-12) "); //ask for month
    boolean monthBoo = myScanner.hasNextInt();// have a boolean to determine if integer
    double numMonth = myScanner.nextDouble(); // save number for futre use


if (monthBoo == true){ //ensure number is an integer
    
  if (numMonth > 0) {//make sure number is positive

       
                        
    if (numMonth == 1){ //January
        System.out.println("The month has 31 days");
    }
    if (numMonth == 3){ //March
        System.out.println("The month has 31 days");
    }
    if (numMonth == 4){ //April
        System.out.println("The month has 30 days");
    }
    if (numMonth == 5){ //May
        System.out.println("The month has 31 days");
    }
    if (numMonth == 6){ //June
        System.out.println("The month has 30 days");
    }
    if (numMonth == 7){ //July
        System.out.println("The month has 31 days");
    }
    if (numMonth == 8){ //August
        System.out.println("The month has 31 days");
    }
    if (numMonth == 9){ //September
        System.out.println("The month has 30 days");
    }
    if (numMonth == 10){ //October
        System.out.println("The month has 31 days");
    }
    if (numMonth == 11){ //November
        System.out.println("The month has 30 days");
    }
    if (numMonth == 12){ //December
        System.out.println("The month has 31 days");
    }
    if (numMonth == 2) { //February
        System.out.println("Enter an int giving the year "); //ask for year to determine if leap year
        double year = myScanner.nextDouble();
        
        if (year % 4 ==0) { //if number has a remainder of 0, then it is a leap year
        System.out.println("The month has 29 days");
        }
        else { //otherwise, it has 28 days
        System.out.println("The month has 28 days");
        }
        
    }
    
  }
  else {
      System.out.println("You did not enter an integer between 1 and 12");   
      return;
       }     //if number is not positive
  
}
else {
    System.out.println("You did not enter an interger between 1 and 12");
    return;
    }        //if number is not an integer

    
    
    

    
    
    
    
    
}// end main method
    } // end class