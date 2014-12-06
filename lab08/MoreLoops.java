//Ryan Judge

//October 17

//lab08

//This lab is designed to help us practice with loops

import java.util.Scanner;
public class MoreLoops  {
    public static void main(String[] args)  {
        
        Scanner scan=new Scanner(System.in);
        int n=0;
        
        System.out.print("Enter an int-");
//        while (!scan.hasNextInt()){
//            scan.next();    //get rid of the junk entered by the user
//            System.out.print("You did not enter an int; try again-");
//        }
        //replace with a do while loop
        if (!scan.hasNextInt()) {
        do {
                scan.next();    //get rid of the junk entered by the user
                System.out.print("You did not enter an int; try again-");
            
        }   while (!scan.hasNextInt());
        }
        
        n=scan.nextInt();
        /*for(int j=0; j<n && j<40; j++)  {
            for(int k=0; k<j+1; k++)    {
                System.out.print("*");
            }
            System.out.println();
        }
        */
    
        //replace the above with while statements
        int j=0;
          while(j<n && j<40)  {
              int k=0;
            while(k<j+1)    {
                System.out.print("*");
                k++;
            }
            j++;
            System.out.println();
          }
            
        
        int k=4;
        
        /*do{
            System.out.println("k="+k);
            k++;
        } while(k<4);
        */
        //replace the code with a while loop
        
        while(k<=4) {
            System.out.println("k="+k);
            k++;
        }
        
        /*int count=0;
        while(true) {
            switch(n)   {
                default:System.out.println(n+"is >5 or <1");
                break;
                case 1:
                case 2:
                    System.out.println("Case 2");
                    continue;
                case 3: break;
                case 4: System.out.println("Case 4");
                case 5: System.out.println("Case 5");
                break;
            }
            count++;
            if(count>10)
            break;
        }
        */
        //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY 
        
    for (int count=0; count<10; count++)    {
        if (n>5 || n<1) {
            System.out.println(n+"is >5 or <1");
            return;
        }
        else if (n==1 || n==2)  {
            System.out.println("Case 2");
            count--;
        }
        else if (n==3)  {
            return;
        }
        else if (n==4)  {
            System.out.println("Case 4");
            System.out.println("Case 5");

        }
        else if (n==5)  {
            System.out.println("Case 5");
        }
    }
    
    }   //end of main method
}   //end of class