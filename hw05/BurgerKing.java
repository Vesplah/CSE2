//Ryan Judge

//September 30

//hw05

//This program is designed to help us gain experience with selection statements, booleans and operators

//program 1

import java.util.Scanner;

public class BurgerKing {
    public static void main(String[] args) {
       
        Scanner myScanner;
       
        myScanner = new Scanner(System.in);

System.out.println("Enter a letter to indicate a choice of:");
System.out.println("Burger (B or b)");
System.out.println("Sode (S or s)");
System.out.println("Fries (F or f)");
String order = myScanner.next();
int Length = order.length();

if (Length == 1){
    switch (order){
        case "B":
        case "b":
            System.out.println("Press A or a for all the fixings");
            System.out.println("Press C or c for cheese");
            System.out.println("Press N or n for none of the above");
            String toppings = myScanner.next();
            
            switch (toppings){
                case "A":
                case "a":
                    System.out.println("You ordered a burger with all the fixings");
                    break;
                case "C":
                case "c":
                    System.out.println("You ordered a burger with cheese");
                    break;
                case "N":
                case "n":
                    System.out.println("You ordered a burger with nothing on it");
                    break;
                default:
                    System.out.println("You did not enter a valid selection");
                    break;
            }
            break;
        case "S":
        case "s":
            System.out.println("Would you like Pepsi (P or p), Coke (C or c), Sprite (S or s) or Mountain Dew (M or m) " );
            String drink = myScanner.next();
            switch (drink){
                case "P":
                case "p":
                    System.out.println("You ordered Pepsi");
                    break;
                case "C":
                case "c":
                    System.out.println("You ordered Coke");
                    break;
                case "S":
                case "s":
                    System.out.println("You ordered Sprite");
                    break;
                case "M":
                case "m":
                    System.out.println("You ordered Mountain Dew");
                    break;
                default:
                    System.out.println("You did not enter a valid selection");
                    break;
            }
            break;
        case "F":
        case "f":
            System.out.println("Do you want a large or a small order of fries? (L,l,S,s)");
            String fries = myScanner.next();
            switch (fries){
                case "L":
                case "l":
                    System.out.println("You ordered large fries");
                    break;
                case "S":
                case "s":
                    System.out.println("You ordered small fries");
                    break;
                default:
                    System.out.println("You did not enter a valid selection");
                    break;
            }
            break;
    }
}
else {
    System.out.println("Single character expected");
    return;
}


    }
}