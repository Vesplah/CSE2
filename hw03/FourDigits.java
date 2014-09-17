//Ryan Judge
//September 16
//hw03 program3

import java.util.Scanner;

public class FourDigits { //define a class


    public static void main(String [] args) {  //main method for the program
    
    Scanner myScanner;
     myScanner = new Scanner(System.in);
     
   
        System.out.print("Enter a number with 4 decimal points: ");
            double num = myScanner.nextDouble();
        
        double doubledigits =  num*10000;   //
        
        //Using algebra and mod division the digits should become isolated so I can post them
        
        int dig1 = (int)((doubledigits % 10000)/1000); //isolate the 1st decimal
        
        int dig2 = (int)(((num*10000) - (dig1*1000) - ((int)num*10000))/100); //isolate the second decimal
        
        int dig3 = (int)((((num*10000) - (dig1*1000) - (dig2*100) - ((int)num*10000))/10));//isolate the third decimal
        
        int dig4 = (int)((((num*10000) - (dig1*1000) - (dig2*100) - (dig3*10) - ((int)num*10000))/1)); //isolate the last decimal
        
        
      
        
        
        
        System.out.println("The four digits are " +dig1 +dig2 +dig3 +dig4);
       
     
    }
}