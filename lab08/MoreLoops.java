//Ryan Judge

//October 17

//lab08

//This lab is designed to help us practice with loops

import java.util.Scanner; //import scanner

public class MoreLoops { //create class
    
    public static void main(String [] args) { //create main method
        
        Scanner scan= new Scanner(System.in); //namenew scanner
        
        int n=0;
        
    /*        System.out.print("Enter an int- ");
    while(!scan.hasNextInt()){
    	scan.next(); //get rid of the junk entered by user
    	System.out.print("You did not enter an int; try again- ");
    }
    */
    
        System.out.print("Enter an int - ");
if (!scan.hasNextInt()){
    do{
    scan.next();
    System.out.print("You did not enter an int; try again- ");
} while (!scan.hasNextInt());
}

for(int j=0;j<n && j<40;j++){
    	for(int k=0;k<j+1;k++){
   	 System.out.print('*');
    	}
    	System.out.println();
    } 




        
        
        
        
        
        
        

    }

 }