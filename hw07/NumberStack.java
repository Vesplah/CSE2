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
int x;
int i;
int j;
int k;
int l;
int m;

if (boo ==true){
    if (number >=1 && number <=9){
    for (x=1; x<=number; x++){
   
        String dashes = "";
        String spaces = "";

       for(i=1; i<=((x*2)-1);i++){
           dashes += "-";
       }
       for(j=0; j<number; j++){
           spaces += " ";
       }
       for(k=1; k<x; k++){
           spaces = spaces.substring(0, spaces.length()-1); 
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


            
            
 
    x=1;
    
    while (x <=number){
        String dashes = "";
        String spaces = "";
        
    
    i=1;
    j=0;
    k=1;
    l=0;
    
        
        while (i<=((x*2)-1)){
            dashes += "-";
            i++;
        }
        while (j<number){
            spaces += " ";
            j++;
        }
        while (k<=x){
            spaces = spaces.substring(0, spaces.length()-1);
            k++; 
        }
        while (l<x){
            l++;
            m=0;
            System.out.print(spaces + " ");
            while (m<((x*2)-1)){
                m++;
                System.out.print(x);
                
            }
               System.out.print("\n"); 
        }
         System.out.print(" "+spaces +dashes+ "\n");
           x++;
    }
    
   
    
    

            

    x=1;

    
    do { 
        String dashes = "";
        String spaces = "";
        
        i=1;
        j=0;
        k=1;
        l=0;
        
         do {dashes += "-";
            i++;
         } while (i<=((x*2)-1));
         do {spaces += " ";
            j++;
         } while (j<number);
         do { spaces = spaces.substring(0, spaces.length()-1);
            k++; 
         } while (k<=x);
         do { 
            System.out.print(spaces +" ");
            l++;
            m=0;
            do {m++;
                System.out.print(x);
            } while (m<((x*2)-1));
            System.out.print("\n");
         } while (l<x);
     System.out.print(" "+ spaces +dashes+ "\n");
           x++;
    }while (x<=number);      
        
}
else {
    System.out.println("Not an acceptable integer");
            }
}
else {
    System.out.println("Not an acceptable integer");
            }
}

}