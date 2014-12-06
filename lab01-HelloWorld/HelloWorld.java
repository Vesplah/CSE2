//javac HelloWorld.java
////
//java HelloWorld//
/////
  public class HelloWorld{
    
    public static void main(String[] args) {
     System.out.println("##########################");
     System.out.println("##########################");
     System.out.println("#                        #");
     System.out.println("#     Hello World 2014   #");
     System.out.println("#                        #");
     System.out.println("##########################");
     System.out.println("##########################");
     System.out.println("testing");
    }
    
    
   
    public static int linearSearch(int[] list, int key){
        for (int i =0; i<list.length; i++){
            if (key == list[i])
            return i;
        }
        return -1;
    }
    
    
    
    
    
  }
  
     
     
     
     
     
          
/*  
//showHands();
simulateOdds();
}
/*public static void showHands()
{
    
    
    int[] deck = new int[52];
    String[] suits = {"Clubs" , "Diamonds", "Hearts" , "Spades"};
    String[] ranks = {"Ace" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

for (int i =0; i < deck.length; i++)
   { deck[i]=i;
}
for (int i = 0; i < deck.length; i++)
{
    int index = (int)(Math.random() * deck.length);
    int x = deck[i];
    deck[i] = deck[index];
    deck[index] = x;
}
String rank ="";
String suit ="";
for (int i =0; i<5; i++)
{
    suit = suits[deck[i] / 13];
    rank = ranks[deck[i] % 13];
    
}
    System.out.print("Clubs:");
        if (suits[deck[0] /13] == "Clubs")
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
        if (suits[deck[0] /13] == "Diamonds")
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
        if (suits[deck[0] /13] == "Hearts")
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
        if (suits[deck[0] /13] == "Spades")
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
     System.out.print("\n")
    
}    

   
    


public static void simulateOdds()
{
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

for (int g =0; g<=10000; g++)
{
    int[] deck = new int[52];
    String[] suits = {"Clubs" , "Diamonds", "Hearts" , "Spades"};
    String[] ranks = {"Ace" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

for (int i =0; i < deck.length; i++)
   { deck[i]=i;
}

for (int i = 0; i < deck.length; i++)
{
    int index = (int)(Math.random() * deck.length);
    int x = deck[i];
    deck[i] = deck[index];
    deck[index] = x;
}
String rank ="";
String suit ="";


    

   
for (int i =0; i<5; i++)
{
suit = suits[deck[i] / 13];
rank = ranks[deck[i] % 13];
    
}


    for (int i = 0; i<=5; i++){
        if (deck[i]%13 == deck[i+1]%13) {
            if (deck[1]%13 == 1)
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
            if (deck[i]%13 ==13){
                king++;
            }
                
                
            
            
            
            
            
            
        }
        
        
    
       /* if ((deck[i] % 13) == 2 && (deck[i-1] % 13) ==2 ){
        two++;}
        if ((deck[i] % 13) == 3 && (deck[i-1] % 13) ==3 ){
        three++;}
         if ((deck[i] % 13) == 4 && (deck[i-1] % 13) ==4 ){
        four++;}
         if ((deck[i] % 13) == 5 && (deck[i-1] % 13) ==5 ){
        five++;}
         if ((deck[i] % 13) == 6 && (deck[i-1] % 13) ==6 ){
        six++;}
         if ((deck[i] % 13) == 7 && (deck[i-1] % 13) ==7 ){
        seven++;}
         if ((deck[i] % 13) == 8 && (deck[i-1] % 13) ==8 ){
        eight++;}
         if ((deck[i] % 13) == 9 && (deck[i-1] % 13) ==9 ){
        nine++;}
         if ((deck[i] % 13) == 10 && (deck[i-1] % 13) ==10 ){
        ten++;}
         if ((deck[i] % 13) == 11 && (deck[i-1] % 13) ==11){
        jack++;}
         if ((deck[i] % 13) == 12 && (deck[i-1] % 13) ==12 ){
        queen++;}
         if ((deck[i] % 13) == 13 && (deck[i-1] % 13) ==13 ){
        test++;}
        
        
        
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


}


}


