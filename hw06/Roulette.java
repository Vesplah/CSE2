//Ryan Judge

//October 14

//hw06 program 1

//This program is designed to help us practice with loops


import java.util.Scanner; //import scanner
import java.util.Random; //import random number generator

public class Roulette { //define class
    
    public static void main(String [] args) { //define main method
        
        
        Scanner myScanner= new Scanner(System.in); //name new scanner
        
        Random rand = new Random();
        
        System.out.println("Enter roulette number: "); //prompt user for number
        
        //all variables for later use
           int correct=0;
           int losses=0;
           int winnings=0;
           int totalWinnings=0;
            
            if (myScanner.hasNextInt()){ //ennsures the number entered is an integer
                int prediction = myScanner.nextInt();
                if (prediction<38 && prediction >=0){ //set boundaries for the numbers
                 
                  for (int x=0; x<1000; x++){ //loop the program for 1000 instances
                   correct=0;
                    for (int times =0; times<100; times++){ //100 roulettle spins
                        int random = rand.nextInt(38);
                            if (random == prediction){ //if thhe result is the prediction
                                correct++;
                            }
                        }
                        
                        if (correct*36 == 0){ //count up the times of total loss
                            losses++;
                        }
                        if (correct*36 > 100){ //count up the times money was made
                            winnings++;
                        }
                        totalWinnings += (correct*36); //calculate total money
                        }
                        
                    System.out.println("Total Losses: " +losses+ " Times money was made: " +winnings+ " Total Winnings: $" +totalWinnings);
                    
                  }
                   else{
                       System.out.println("Not a number on the roullette wheel");
                   } 
                }
                else{
                    System.out.println("Not a valid choice");
                }
        
        
    }
}
    
