//Ryan Judge
//September 16
//hw03 Program 2
//This program is to provide practice for user input in programs

import java.util.Scanner;

public class Root { //define a class

    public static void main(String [] args) {  //main method for the program
    
    Scanner myScanner; //set scanner to allow for user input
      myScanner = new Scanner(System.in);
      
      
System.out.print("Enter a double and I print the cube root: ");// ask for user input
    double guess = myScanner.nextDouble();

double root = +Math.pow(guess,.3333);

//I used a different method of finding the cube root
    
System.out.println("The cube root is: " +root); 
System.out.println((root) "*" (root) "*" (root) "=" +Math.cbrt(guess)*Math.cbrt(guess)*Math.cbrt(guess));

      
    }
}