//Ryan Judge

//November 4

//hw09

//This program is designed to help us practice with methods calling other methods and solving large problems using subproblems
//default method 
import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }


//problem A


public static int getInt()
{
    
    
    int number=0;
    boolean control1 = true;
    boolean control2 = true;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer inclusivly between 1 and 9: ");
   
    
    
    bigLoop: while (control1 = true)
    {   boolean input = scan.hasNextInt();
        if (checkInt(input) == false){ // make sure the number is an integer
        System.out.println("Please input an integer: ");
        scan.next(); //reset the scanner to enter another value
        }
        if (checkInt(input) == true && control2 == true){ //ensure the input is an integer
            smallLoop: while (control2 = true)
            {
            number = scan.nextInt();
            boolean range = checkRange(number);
            if (range == true){
                break bigLoop; // get out of the whole loop
                
            }
            if (range == false){
                System.out.println("Not in range: ");
                break smallLoop;//repeat the smaller loop until correct
            }
            
            
           }
        }
        
    }
    
        
    
   
    int m = number;
return m;
}


public static boolean checkInt(boolean input2)
{
    boolean d = true;
   
    Scanner scan = new Scanner(System.in);
    

    while (input2 == false){
        d = false;
        break;
        }
  
    while (input2 == true){
        d = true;
        break;
        }
return d; //return a boolean to determine if the input is an int 
} 




public static boolean checkRange(int number2)
{ 
    Scanner scan = new Scanner(System.in);
    boolean range =true;
    
   
    while (number2 >=1 && number2 <= 9)
    {
        range = true;
        break;
    }
    while (number2 <1 || number2 > 9)
    {
        range = false;
        break;
    }
return range; //return boolean to see input is between range
}

public static void allBlocks(int m)
{
    String dashes = "";
    int counter = 0;
    while(counter <= m){
        dashes = block(m, counter);
        String spaces = line(m, counter);
        counter++;
        System.out.print(spaces +dashes +"\n");
    }
    

}

public static String block(int m, int counter)
{int x;
int i;
int j;
int k;
int l;
int q;
String dashes = "";
String spaces = line(m , counter);
   
   for (l=0; l<counter; l++){
           dashes += "\n" + spaces;
            for (q=0 ; q<((counter*2)-1); q++){
                dashes+=counter;
            }
   }
   dashes += "\n" + spaces;
   for(i=1; i<=((counter*2)-1);i++){//get number of dashes
           dashes += "-";
       }
   return dashes;
}
public static String line(int m, int counter)
{   
    
    String spaces = "";
    
        
    //variables
int x;
int i;
int j;
int k;
int l;

        

        for(j=0; j<m; j++){
           spaces += " "; //max number of spaces
        }
        for(k=1; k<counter; k++){
           spaces = spaces.substring(0, spaces.length()-1);  //remove spaces as neccesary
       }
        
            
        
               
       
    

return spaces;
}
}