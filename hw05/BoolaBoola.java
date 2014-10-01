//Ryan Judge

//September 30

//hw05

//This program is designed to help us gain experience with selection statements, booleans and operators

//program 2

import java.util.Scanner;


public class BoolaBoola {
    public static void main(String [] args) {
        
        Scanner myScanner;
        
        myScanner= new Scanner(System.in); //variables
        boolean firstBoo;
        boolean secondBoo;
        boolean thirdBoo;
        //random booleans
        double firstNum = Math.random();
            if (firstNum > 0.5){
                firstBoo = true;
            }
            else {
                firstBoo = false;
            }
        double secondNum = Math.random();
            if (secondNum >= 0.5){
                secondBoo = true;
            }
        else {
                secondBoo = false;
            }
        double thirdNum = Math.random();
            if (thirdNum > 0.5){
                thirdBoo = true;
            }
        else {
                thirdBoo = false;
            }
        
        String PrintOp1;
        String PrintOp2;
         //get random operators
        boolean operator1;
            if (Math.random() > .5){
                operator1 = true;
                PrintOp1 = "||";
            }
            else{ operator1=false;
                PrintOp1 = "&&";
            }
        
        
        boolean operator2;
            if (Math.random() > .5){
                operator2 = true;
                PrintOp2 = "||";
            }
            else{ operator2=false;
                PrintOp2 = "&&";
            }
        
        boolean Answer;
        
        if (PrintOp1 == "||" && PrintOp2 == "||")
        { 
            Answer = firstBoo || secondBoo || thirdBoo;
        }
        else if (PrintOp1 == "||" && PrintOp2 == "&&")
        {
            Answer = firstBoo || secondBoo && thirdBoo;
        }
        else if (PrintOp1 == "&&" && PrintOp2 == "||")
        {
            Answer = firstBoo && secondBoo || thirdBoo;
        }
        else if (PrintOp1 == "&&" && PrintOp2 == "&&")
        {
            Answer = firstBoo && secondBoo && thirdBoo;
        }
        
    System.out.println("Does " +firstBoo+ " " +PrintOp1+ " " +secondBoo+ " " +PrintOp2+ " " +thirdBoo+ " have the value true (T or t) or false (F or f)");
    String UserAnswer =  myScanner.next();
    
    
    
    
    if ((UserAnswer == "t" || UserAnswer ==  "T") && (Answer = true))
    {
        System.out.println("Correct");
    }
    else if ((UserAnswer == "f" || UserAnswer == "F") && (Answer = false))
    {
        System.out.println("Correct");
    }
    else
    {
        System.out.println("Wrong");
    }
    }
}
