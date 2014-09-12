//Ryan Judge
//September 12
//lab03
//This program is designed to perfrom basic computations

import java.util.Scanner;

public class BigMac { //Define a class
    public static void main(String[] args) { ////main method required for every program
    
Scanner myScanner;
    myScanner = new Scanner(System.in);
    

    
System.out.print("Enter the number of Big Macs(an interger > 0): ");//ask user for information
    int nBigMacs = myScanner.nextInt();//accpet user input
System.out.print("Enter the Cost per Big Mac as" + "a double (in the form of xx.xx): ");
    double bigMac$ = myScanner.nextDouble();
System.out.print("Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100; //user enters percent, but I want proportion

double cost$;
int dollars, dimes, pennies; //whole amounts for storing data, pennies and dimes for storing to right of decimal point
cost$ = nBigMacs*bigMac$*(1+taxRate);
dollars = (int)cost$; //dollar amount
dimes = (int) (cost$*10)%10; //dime amount
pennies = (int) (cost$*100)%10;//penny amount

System.out.println("The total cost of " +nBigMacs
 +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
 " sales tax of "+ (int)(taxRate*100) + "%, is $" + dollars + '.' + dimes+pennies);
    
    
    
    
    
    }//end main method
}//end class