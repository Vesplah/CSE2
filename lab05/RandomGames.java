//Ryan Judge

//September 26

//lab05

//This lab is designed to have use practice switch statments and generate random numbers


import java.util.Scanner;


public class RandomGames { //defiine a class

    public static void main(String[] args) { //start main method
    
    Scanner myScanner;

    myScanner = new Scanner( System.in );
 

System.out.print("Enter (R) or (r) for Roulette, (C) or (c) for craps, (P) or (p) for pick a card: " );
String Game = myScanner.next();
int Length = Game.length();   

if (Length == 1){
    
    switch (Game) {
        case "R":
        case "r":
            int Min = Math.min(00,37);
            int Max = Math.max(00,37);
            
            int randomNum = Min+(int)(Math.random()*((Max-Min) + 1)); 
                if (randomNum == 37){
                double randomD = (double) randomNum;
                String randomString = String.valueOf(randomD);
                randomString = "00";
                System.out.println("Roulette: " +randomString);
                return;
                }
                else {}
            
            System.out.println("Roulette: " +randomNum);
            break;
        case "C":
            System.out.println("Craps option not yet implmented");
            break;
        case "c":
            System.out.println("Craps option not yet implmented");
            break;
        case "P":
            System.out.println("Picking option not yet implemented");
            break;
        case "p":
            System.out.println("Picking option not yet implemented");
            break;
        default:
            System.out.println("Please eneter a valid selection");
            break;
    } 
}    
else {
        System.out.println("A single character expected");
}    
    
    
    
    
    }//end main method
}// end class