//Ryan Judge

//November 18

//hw10 program 1

//This program is designed to help us practice with arrays


//code given
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }

// first called method
public static boolean hasDups(int[] num)
{
    boolean boo; //returnint boolean
    int q =0; //starting variable to count
    java.util.Arrays.sort(num);//sort the numbers to order them
   // System.out.println(num[0]);
    //System.out.println(num[1]);
    for (int n=1; n<num.length; n++)
    {
        if(num[n] == num[n-1]) //if the numbers next to eachother are the same, they are dups
        {
            q+=1;
        }
        
    }
    if (q>=1){ //if at least one dup was recorded
        boo = true;
      
    }
    else {
        boo = false;
      
    }

 return boo;
 
}



public static boolean exactlyOneDup(int[] num)
{
    boolean boo; // boolean to be returned
    int q =0; //variable to count
    java.util.Arrays.sort(num); //order the numbers found
    for (int n=1; n<num.length; n++) // if the numbers next to each other are the same, they are dups
    {
        if(num[n] == num[n-1])
        {
            q+=1;
        }
        
    }
    if (q==0 || q>=2){ //must be exactly one
        boo = false;
        
    }
    else {
        boo = true;
       
    }
    
return boo;
}

    
    
    
    
    
    
    
    
    
    
    
}