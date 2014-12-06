//Ryan Judge

//December 5

//hw11 program 1

//This program is designed to help us manipulate arrays

import java.util.Scanner;
import java.util.Arrays;

public class PokerHands {
    public static void main(String [] args) {
    boolean control = true;  
int rank[]=new int[13];
int suit[]=new int[5];
int originalRank[];
int originalSuit[];
int suitInt= 0;
int rankInt=0 ;
int i =0;


 System.out.println("Enter 'y' or 'Y' to enter a(nother) hand-");
    Scanner scan = new Scanner (System.in);
    String start = scan.next();
     while (start.equals("Y") || start.equals("y")) 
    {   
       for (int x=0; x < 5 ;x++)
        {
            
        controlLoop: for (int v=0; v <1; v++)
        {
            System.out.println("Enter the suit: 'c', 'd', 'h', or 's'");
            String suitString = scan.next();
            while (!(suitString.equals("c") || suitString.equals("d") || suitString.equals("h") || suitString.equals("s")))
            {
            System.out.println("Not an acceptable input");
            System.out.println("Enter the suit: 'c', 'd', 'h', or 's'");
            suitString = scan.next();
            }
            System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', '9', '8', '7', '6', '5', '4', '3','2' -");
            String rankString = scan.next();
            while (!(rankString.equals("a") || rankString.equals("k") || rankString.equals("q") || rankString.equals("j") || rankString.equals("10") || rankString.equals("9")|| rankString.equals("8")|| rankString.equals("7")|| rankString.equals("6")|| rankString.equals("5")|| rankString.equals("4") || rankString.equals("3")|| rankString.equals("2")))
            {
            System.out.println("Not an acceptable input");
            System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', '9', '8', '7', '6', '5', '4', '3','2'");
            rankString = scan.next();
            }
        
            switch (suitString)
            {
                case "c": 
                    suitInt=1;
                    break;
                case "d":
                    suitInt=2;
                    break;
                case "h":
                    suitInt=3;
                    break;
                case "s":
                    suitInt=4;
                    break;
            }
            switch (rankString)
            {
                case "a":
                    rankInt=13;
                    break;
                case "k":
                    rankInt=12;
                    break;
                case "q":
                    rankInt=11;
                    break;
                case "j":
                    rankInt=10;
                    break;
                case "10":
                    rankInt=9;
                    break;
                case "9":
                    rankInt=8;
                    break;
                case "8":
                    rankInt=7;
                    break;
                case "7":
                    rankInt=6;
                    break;
                case "6":
                    rankInt=5;
                    break;
                case "5":
                    rankInt=4;
                    break;
                case "4":
                    rankInt=3;
                    break;
                case "3":
                    rankInt=2;
                    break;
                case "2":
                    rankInt=1;
                    break;
            
            }
            
            suit[x]= suitInt;
            rank[x]= rankInt;
            
            
            for (int q = 4; q>=0; q--)
            {
                i = x;
                if (suit[q] != 0 && rank[q] !=0)
                {
                    if ((i!=q) && (suit[i] == suit[q]) && (rank[i] == rank[q]))
                    {
                         System.out.println("Already entered the card, try again");
                         suit[x] =0;
                         rank[x] =0;
                         x--;
                         break controlLoop;
                    }
                }
            }
            
            if (x == 4)
            {
             break;   
            }
        }
        }
        
   showOneHand(suit, rank);
    
    System.out.println("Enter 'y' or 'Y' to enter a(nother) hand-");
     start = scan.next();
        
    }
    if (!(start.equals("Y") || start.equals("y")))
    {
        return;
    }

}



    public static void showOneHand(int suit[], int rank[])
    {
        String Bestcombination = " ";
        String Apples = "";
        String convert;
        String clubs = "";
        String diamonds = "";
        String hearts = "";
        String spades = "";
        for (int w = 0; w<suit.length; w++)
        {
            if (suit[w] == 1)
            {
                 switch (rank[w])
                {
                case 13:
                    clubs+="A ";
                    break;
                case 12:
                    clubs+="K ";
                    break;
                case 11:
                    clubs+="Q ";
                    break;
                case 10:
                    clubs+="J ";
                    break;
                }
                if (rank[w] <10 && rank[w] >=1)
                {
                   
                 convert=Integer.toString(rank[w]+1);
                    clubs += convert;
                }
            }
            if (suit[w] == 2)
            {
                 switch (rank[w])
                {
                case 13:
                    diamonds+="A ";
                    break;
                case 12:
                    diamonds+="K ";
                    break;
                case 11:
                    diamonds+="Q ";
                    break;
                case 10:
                    diamonds+="J ";
                    break;
                }
                if (rank[w] <10 && rank[w] >=1)
                {
                 convert=Integer.toString(rank[w]+1);
                    diamonds += convert;
                }
            }
            if (suit[w] == 3)
            {
                 switch (rank[w])
                {
                case 13:
                    hearts+="A ";
                    break;
                case 12:
                    hearts+="K ";
                    break;
                case 11:
                    hearts+="Q ";
                    break;
                case 10:
                    hearts+="J ";
                    break;
                }
                if (rank[w] <10 && rank[w] >=1)
                {
                 convert=Integer.toString(rank[w]+1);
                    hearts += convert;
                }
            } 
            if (suit[w] == 4)
            {
                 switch (rank[w])
                {
                case 13:
                    spades+="A ";
                    break;
                case 12:
                    spades+="K ";
                    break;
                case 11:
                    spades+="Q ";
                    break;
                case 10:
                    spades+="J ";
                    break;
                }
                if (rank[w] <10 && rank[w] >=1)
                {
                 convert=Integer.toString(rank[w]+1);
                    spades += convert;
                }
            }
        }
        System.out.println("Clubs: " +clubs);
        System.out.println("Diamonds: " +diamonds );
        System.out.println("Hearts: " +hearts);
        System.out.println("Spades: " +spades);
        BestHand(suit,rank,Bestcombination);
        
    }

public static void BestHand(int suit[], int rank[], String Apples)
{
    
    Apples = "";
    Arrays.sort(suit);
    Arrays.sort(rank);
   
    if (rank[0] == 9)
    {
        if (((rank[0]==9) && (rank[1]==10)) && (rank[2]==11) && (rank[3]==12) && (rank[4] == 13) )
        {
                if ((suit[0]==suit[1]) && (suit[1]==suit[2]) && (suit[2]==suit[3]) && (suit[3]==suit[4]))
                {
                    System.out.println("Royal Stright Flush") ; 
                    return;
                }
        
        }
    }    
    
    if ((rank[1] == (rank[0]+1)) && (rank[2] == (rank[1]+1)) && (rank[3] == (rank[2]+1)) && (rank[4] == (rank[3]+1)))
    {
                if ((suit[0]==suit[1]) && (suit[1]==suit[2]) && (suit[2]==suit[3]) && (suit[3]==suit[4]))
                {
                    System.out.println(" Straight Flush") ; 
                    return;
                }
        
    }   
    
        if (((rank[0]==rank[1]) && (rank[1]==rank[2]) && (rank[2] == rank[3]) && (rank[3]==rank[4])) || ((rank[1]==rank[2]) && (rank[2]==rank[3]) && (rank[3] == rank[4])))
            {
                    System.out.println("4 of a kind ") ; 
                    return;
            }
        if (((suit[0] == suit[1]) && (suit[2] == suit[3]) && (suit[3] == suit [4])) || ((suit[0] == suit[1]) && (suit[1] == suit[2]) && (suit[3] == suit[4])))
        {
            System.out.println(" Full House") ; 
            return;
        }
        if ((suit[0]==suit[1]) && (suit[1]==suit[2]) && (suit[2]==suit[3]) && (suit[3]==suit[4]))
        {
           System.out.println(" Flush ") ; 
            return;
        }
         if ((rank[1] == (rank[0]+1)) && (rank[2] == (rank[1]+1)) && (rank[3] == (rank[2]+1)) && (rank[4] == (rank[3]+1)))
         {
           System.out.println("Straight ") ; 
            return;  
         }
         if (((rank[0] == rank[1]) && (rank[2] == rank[3]) || (rank[3] == rank[4])) || ((rank[1] ==rank[2]) && (rank[3] == rank[4])))
         {
             System.out.println("Two pair ") ; 
             return;
         }
         if ((rank[0] == rank[1]) || (rank[1] == rank[2]) || (rank[2] == rank[3]) || (rank[3] == rank[4]))
         {
             System.out.println("One pair ") ; 
             return;
         }
        System.out.println(" High Card") ; 
         return;
    }
  
    
    
}
















