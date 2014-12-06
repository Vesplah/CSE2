//Enigma 3 Program
    //fix any logic, run time, or compiler errors
    
/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] args){
    int n=40,k=60;
    int out=0;
    switch(k%14){
      case 4:
          out+=4;   //out shoud be 4
          break;
      case 12: 
          out+=12;  
          break;
      case 13: 
         out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
          break;
    }
    if(((n*k)%12) < 12){
      n-=20;    //n now equals 20
      out+=n;   //out 24
      
    }
    else if(n*n>k){  //conditionas are not met
      n=42;
      out+=n+k;
      
    }
    else {
      n=45;
      out+=n+k;
      System.out.println(out);
    }
    
    switch(n+k){    //20+60
      case 114: 
        n-=11;
        k-=3;
        System.out.println("n is "+n);
        System.out.println("k is "+k);
        break;
      case 97:
        n-=14;
        k-=2;
       System.out.println("n is "+n);
       System.out.println("k is "+k);
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println("n is "+n);
        System.out.println("k is "+k);
        break;
      default:  //will go to this
        n-=3;   //n now 17
        k-=5;   //k now 55
        System.out.println("k is "+k);
        System.out.println("n is "+n);
        break;
    }
     out=out+(1/n + 1/k);   
    System.out.println(out);
  }
}

/*
 * Error report:
 * added breaks
 * the first switch statement outputs the number 4 but there is no case for it
                added 4 to output
    made conditions for 12 in first if statement
 * declared out as an int and set equal to 0 to initialize
 * made the if statement an else if statement so that it would be evaluated
 */