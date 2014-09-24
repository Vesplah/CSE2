//Ryan Judge
//September 23
//hw 04 program 1
//This homework is designed to have us practice selection statements, comparison operators and Booleans

import java.util.Scanner; //new scanner

public class IncomeTax { //declare class
    public static void main(String [] args) { //declare main method
        
Scanner myScanner;
    myScanner = new Scanner( System.in ); //name new scanner
    
    
    
    System.out.print("Enter an integer giving the number of thousands- " ); //ask for an integer
    boolean Thousands = myScanner.hasNextInt(); //have a boolen for if statement
    double numThousands = myScanner.nextDouble(); //store the double for futrue use
    
    if (numThousands > 0){ //make sure number is positive
    
        if (Thousands == true ) { //make sure number is an interger
        
        
        //All these lines will filter out how much tax money will be spent on someones money
        
            if (numThousands < 20){
                double taxNum = 5;
                double taxRate = taxNum/100;
                System.out.println("The tax rate for " + 1000*numThousands+"$ is "
                +taxNum+ "% and the tax is "+Math.round(taxRate*(1000*numThousands)*100.0)/100.0+ "$"  );
                                  }
            else if (( 20 <=numThousands ) && (numThousands < 40)){    
                double taxNum = 7;
                double taxRate = taxNum/100;
                System.out.println("The tax rate for " + 1000*numThousands+"$ is " 
                +taxNum+ "% and the tax is "+Math.round(taxRate*(1000*numThousands)*100.0)/100.0+ "$"  );
                                                                  }
            else if (( 40 <=numThousands ) && (numThousands <78)) {
                double taxNum = 12;
                double taxRate = taxNum/100;
                System.out.println("The tax rate for " + 1000*numThousands+"$ is " 
                +taxNum+ "% and the tax is "+Math.round(taxRate*(1000*numThousands)*100.0)/100.0+ "$"  );
                                                                  }
            else if (78 <= numThousands) {
                double taxNum = 14;
                double taxRate = taxNum/100;
                System.out.println("The tax rate for " + 1000*numThousands+"$ is " 
                +taxNum+ "% and the tax is "+Math.round(taxRate*(1000*numThousands)*100.0)/100.0+ "$"  );
                                         }
                                                                   
                    
       
            }
            else {
                 System.out.println("You did not enter an integer"); // if the number is poitive but not an integer, it will go here
                 }
    
    }
    else{       
         System.out.println("You did not enter a positive integer"); //negatibe numbers will go here
         return;
        }
        
    } //end main method
} //end class