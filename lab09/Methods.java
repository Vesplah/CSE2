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
                   	
}
public int larger(int a, int b, int c);
        if (a > b){
            return(a);
        }
        else (b > a){
            return(b);
        }       
        
}