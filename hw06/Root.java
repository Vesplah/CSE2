//Ryan Judge

//October 14

//hw06 program 2

//This program is designed to help us practice with loops

import java.util.Scanner; //import scanner

public class Root { //create class
    
    public static void main(String [] args) { //create main method
        
        Scanner myScanner= new Scanner(System.in); //namenew scanner
        
     
System.out.println("Enter a double "); //prompt user for input
        boolean boo = myScanner.hasNextInt(); //boolean to make sure number is a double
       
        if (boo == false){
            System.out.println("blah");  //ensures the number is a double
            return;
        }
        
        double input = myScanner.nextDouble(); //save the double for later use
        
       
       
        //variables needed for calculations
        double low = 0;
        double high = 1 + input;
        double middle =0;
        double square;
        
        
        
        //make sure number is poitive
        if (input < 0){
            System.out.println("Negative Number");
            return;
        
            
        
        } 
        while ((high-low) > (0.0000001*(1+input))){ //determines when the "while loop" will stop running
            middle = ((high - low)/2)+low;
            if ((middle*middle) > input){
                high = middle;
                
            }
            else {
                low = middle;
            }
        
        }
        System.out.println(middle); //middle is equal to high or low, which are close to eachother.  This is the squaare root
    }// end main method
}//end class