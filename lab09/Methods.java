//Ryan Judge

//October 24

//lab09

//This program is designed to help us practice with methods


import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three ints");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan);
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
  } //end of main method
  
  public static int getInt(Scanner input)   {
      input=new Scanner(System.in);   //scanner instance
      while (!input.hasNextInt()){
          input.next();  //get rid of junk entered by the user
          System.out.print("You did not enter an int; try again- ");    //if int is not entered, return this error message
          //prompt the user to enter another int in the wrong input's place
      }
      int var1=input.nextInt();  //accept user input
      return var1;  //return var1 to substitute scan in the main class
  } //end of getInt method
  
 public static int larger(int a,int b){
     if (a>b)   {   //test if a is greater than b
         return a;  //return a if greater
     }
     else {
         return b;  //return b into main method if greater
     }
 }  //end of larger method
 
 public static boolean ascending(int a,int b,int c){
     if (a<b && a<c)    {   //check that the order of inputs in ascending
         return true;
     }
     else {
         return false;
     }
 }  //end of ascending method
  
}   //end of class