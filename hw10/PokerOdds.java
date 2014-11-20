//Ryan Judge

//November 18

//hw10 program 2

//This program is designed to help us practice with arrays

//given code
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
//first method
public static void showHands()
{
    
    
    int[] deck = new int[52]; //deck of 52
    String[] suits = {"Clubs" , "Diamonds", "Hearts" , "Spades"}; //suits in a new array
    String[] ranks = {"Ace" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; //rank in new array

for (int i =0; i < deck.length; i++)
   { deck[i]=i;
}
for (int i = 0; i < deck.length; i++)//randomize the deck
{
    int index = (int)(Math.random() * deck.length);
    int x = deck[i];
    deck[i] = deck[index];
    deck[index] = x;
}


    System.out.print("Clubs:"); //checking for clubs
        if (suits[deck[0] /13] == "Clubs") // if the card in hand is a club, prints the value of the card
     {
         System.out.print(" "+ranks[deck[0] %13]);
     }
        if (suits[deck[1] /13] == "Clubs")
        {
            System.out.print(" "+ranks[deck[1] %13]);
        }
        if (suits[deck[2] /13] == "Clubs")
        {
            System.out.print(" "+ranks[deck[2] %13]);
        }
        if (suits[deck[3] /13] == "Clubs")
        {
            System.out.print(" " +ranks[deck[3] %13]);
        }
        if (suits[deck[4] /13] == "Clubs")
        {
            System.out.print(" " +ranks[deck[4] %13]);
        }
    
     System.out.print("\n");
     System.out.print("Diamonds:");
        if (suits[deck[0] /13] == "Diamonds")// if the card in hand is a diamond, prints the value of the card
     {
         System.out.print(" "+ranks[deck[0] %13]);
     }
        if (suits[deck[1] /13] == "Diamonds")
        {
            System.out.print(" "+ranks[deck[1] %13]);
        }
        if (suits[deck[2] /13] == "Diamonds")
        {
            System.out.print(" "+ranks[deck[2] %13]);
        }
        if (suits[deck[3] /13] == "Diamonds")
        {
            System.out.print(" " +ranks[deck[3] %13]);
        }
        if (suits[deck[4] /13] == "Diamonds")
        {
            System.out.print(" " +ranks[deck[4] %13]);
        }   
     System.out.print("\n");
     System.out.print("Hearts:");
        if (suits[deck[0] /13] == "Hearts")// if the card in hand is a heart, prints the value of the card
     {
         System.out.print(" "+ranks[deck[0] %13]);
     }
        if (suits[deck[1] /13] == "Hearts")
        {
            System.out.print(" "+ranks[deck[1] %13]);
        }
        if (suits[deck[2] /13] == "Hearts")
        {
            System.out.print(" "+ranks[deck[2] %13]);
        }
        if (suits[deck[3] /13] == "Hearts")
        {
            System.out.print(" " +ranks[deck[3] %13]);
        }
        if (suits[deck[4] /13] == "Hearts")
        {
            System.out.print(" " +ranks[deck[4] %13]);
        }   
     System.out.print("\n");
     System.out.print("Spades:");
        if (suits[deck[0] /13] == "Spades")// if the card in hand is a spade, prints the value of the card
     {
         System.out.print(" "+ranks[deck[0] %13]);
     }
        if (suits[deck[1] /13] == "Spades")
        {
            System.out.print(" "+ranks[deck[1] %13]);
        }
        if (suits[deck[2] /13] == "Spades")
        {
            System.out.print(" "+ranks[deck[2] %13]);
        }
        if (suits[deck[3] /13] == "Spades")
        {
            System.out.print(" " +ranks[deck[3] %13]);
        }
        if (suits[deck[4] /13] == "Spades")
        {
            System.out.print(" " +ranks[deck[4] %13]);
        }   
     System.out.print("\n");
    
}    
    
   
    

//second method that was called
public static void simulateOdds()
{
    //varibales to be used later when counting
    int test =12;
    int ace = 0;
    int two=0;
    int three=0; 
    int four =0;
    int five =0;
    int six =0;
    int seven =0;
    int eight =0;
    int nine =0;
    int ten =0;
    int jack =0;
    int queen =0;
    int king =0;

for (int g =0; g<=10000; g++) //repeat 10000 times
{
    int[] deck = new int[52]; //52 cards
    String[] suits = {"Clubs" , "Diamonds", "Hearts" , "Spades"};//naming the suits
    String[] ranks = {"Ace" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; //array for the ranks

for (int i =0; i < deck.length; i++)
   { deck[i]=i;
}

for (int i = 0; i < deck.length; i++) //randomize deck
{
    int index = (int)(Math.random() * deck.length);
    int x = deck[i];
    deck[i] = deck[index];
    deck[index] = x;
}



    for (int i = 0; i<=5; i++){// 5 cards are drawn
        if (deck[i]%13 == deck[i+1]%13) //check if two cards match {
            if (deck[1]%13 == 1) //adds counter to the respective rank if they match
            {
                ace++;
            }
            if (deck[i]%13 ==2){
                two++;
            }
            if (deck[i]%13 ==3){
                three++;}
            if (deck[i]%13 ==4){
                four++;
            }
            if (deck[i]%13 ==5){
                five++;
            }
            if (deck[i]%13 ==6){
                six++;  
            }
            if (deck[i]%13 ==7){
                seven++;
            }
            if (deck[i]%13 ==8){
                eight++;
            }
            if (deck[i]%13 ==9){
                nine++;
            }
            if (deck[i]%13 ==10){
                ten++;
            }
            if (deck[i]%13 ==11){
                jack++;
            }
            if (deck[i]%13 ==12){
                queen++;
            }
            if (deck[i]%13 ==0){
                king++;
            }
                
                
            
            
            
            
            
            
        }
        
        
    
     
        
        
} 

}
    
    System.out.println("Aces: " +ace);
    System.out.println("Twos: " +two);
    System.out.println("Threes: " +three);
    System.out.println("Fours: " +four);
    System.out.println("Fives: " +five);
    System.out.println("Sixes: " +six);
    System.out.println("Sevens: " +seven);
    System.out.println("Eights: " +eight);
    System.out.println("Nines: " +nine);
    System.out.println("Tens: " +ten);
    System.out.println("Jacks: " +jack);
    System.out.println("Queens: " +queen);
    System.out.println("Kings: " +king);
    System.out.println("-------------");
    System.out.println("total not exactly one pair: "+(10000 - (ace+two+three+four+five+six+seven+eight+nine+ten+jack+queen+king)));
    //10000 - total matches is total not matched

}
}

