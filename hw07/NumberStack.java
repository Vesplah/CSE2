//Ryan Judge

//October 21

//hw07 

//This program is designed to help us practice with loops.  While, for and do-while loops

import java.util.Scanner; //import scanner

public class NumberStack{//begin class
    
    public static void main(String [] args) { //create main method
        
        Scanner myScanner= new Scanner(System.in); //name new scanner
        
System.out.println("Enter an integer ");
boolean boo = myScanner.hasNextInt();
int number = myScanner.nextInt();
//all of the variables
int x;
int i;
int j;
int k;
int l;
int m;

if (boo ==true){//determine if the input is a int
    if (number >=1 && number <=9){// int between 1 and 9
    for (x=1; x<=number; x++){///counter for loop
   
        String dashes = "";//being the strings blank
        String spaces = "";

       for(i=1; i<=((x*2)-1);i++){//get number of dashes
           dashes += "-";
       }
       for(j=0; j<number; j++){
           spaces += " "; //max number of spaces
       }
       for(k=1; k<x; k++){
           spaces = spaces.substring(0, spaces.length()-1);  //remove spaces as neccesary
       }
       for (l=0; l<x; l++){
           System.out.print(spaces);
            for (m=0 ; m<((x*2)-1); m++){
                System.out.print(x);
            } 
               
                System.out.print("\n");
                
       }  
                
                
        System.out.print(spaces +dashes +"\n");
        
           
            
            

}


            
            
 //counter
    x=1;
    
    while (x <=number){
        String dashes = "";
        String spaces = "";
        
    //variables
    i=1;
    j=0;
    k=1;
    l=0;
    
        
        while (i<=((x*2)-1)){
            dashes += "-";
            i++;//all dashes
        }
        while (j<number){
            spaces += " ";''//max spaces
            j++;
        }
        while (k<=x){
            spaces = spaces.substring(0, spaces.length()-1);
            k++; //subtract some spaces as it runs
        }
        while (l<x){
            l++;
            m=0;
            System.out.print(spaces + " ");
            while (m<((x*2)-1)){
                m++;
                System.out.print(x);
                
            }
               System.out.print("\n"); //start a new line
        }
         System.out.print(" "+spaces +dashes+ "\n");
           x++;
    }
    
   
    
    

            

    x=1;

    
    do { 
        String dashes = "";//being string blank
        String spaces = "";
        //all the variables
        i=1;
        j=0;
        k=1;
        l=0;
        
         do {dashes += "-";
            i++; //dash number
         } while (i<=((x*2)-1));
         do {spaces += " ";
            j++;//number of spaces max
         } while (j<number);
         do { spaces = spaces.substring(0, spaces.length()-1);
            k++; //subtract some spaces
         } while (k<=x);
         do { 
            System.out.print(spaces +" ");//allign properly
            l++;
            m=0;//cannot be reset to function properly
            do {m++;
                System.out.print(x);
            } while (m<((x*2)-1));
            System.out.print("\n");
         } while (l<x);
     System.out.print(" "+ spaces +dashes+ "\n"); //ensires a new line starts
           x++;
    }while (x<=number);      //boundary
        
}
else {
    System.out.println("Not an acceptable integer");
            }
}
else {
    System.out.println("Not an acceptable integer");
            }
}//end  main method

}//end class