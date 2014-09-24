//Ryan Judge

//September 16

//lab04

//This lab is designed to show us section fragments and run programs with sepcific instructions


import java.util.Scanner;


public class BigMacAgain { //defiine a class

    public static void main(String[] args) { //start main method

    

Scanner myScanner;

    myScanner = new Scanner( System.in );
 
 

double costFries = 2.15;    

System.out.print("Enter number of Big Macs: ");//ask for number of Big Macs
boolean booBigMac = myScanner.hasNextInt();

if (booBigMac==true){
    int numBigMacs = myScanner.nextInt();
    double CostBigMacs = Math.round(numBigMacs * 2.22 *100.0)/100.0; 

    System.out.println("You ordered " +numBigMacs+ " Big Macs for a cost of $" +CostBigMacs);
                    


System.out.print("Would you like fries with that? (Y/y/N/n) ");
String answer = myScanner.next();
double totalCost = CostBigMacs + costFries;


                    
    if (answer.equals("Y")) {
    System.out.println("You ordered fries at the cost of $" +costFries);
    System.out.println("The total cost of the meal is $" +Math.round((totalCost)*100.0)/100.0);
                             }
        else if (answer.equals("y")) {
        System.out.println("You ordered fries at the cost of $" +costFries);
        System.out.println("The total cost of the meal is $" +Math.round((totalCost)*100.0)/100.0);
                                      }
    if (answer.equals("N")) {
            System.out.println("The total cost of the meal is " +Math.round(CostBigMacs*100.0)/100.0+ "$");
                           }
        else if (answer.equals("n")){
                System.out.println("The total cost of the meal is " +Math.round(CostBigMacs*100.0)/100.0+ "$");
                                    }


}
else {
    System.out.println("You did not input an integer");
    return;
         }

    
    
  /*  else {
    System.out.println("You did not input an integer");
    return;
} 
*/
/*System.out.print("Would you like fries with that? (Y/y/N/n) ");
myScanner.next();

if (myScanner.next() == "Y") {
double totalCost = CostBigMacs + costFries;
System.out.println("You ordered fries at the cost of $" +costFries);
System.out.println("The total cost of the mean is $" +totalCost);
*/


} //end  main method
 }// end class
