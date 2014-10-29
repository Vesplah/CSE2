
//Ryan Judge

//October 28

//hw08

//This program is designed to help us practice with overloading methods
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	
	char input;
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	
	input=getInput(scan,"Cc");
	
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	
	input=getInput(scan,"yYnN",5); //give up after 5 attempts

	if(input!=' '){
	    
   	System.out.println("You entered '"+input+"'");
   	
	}
	
	input=getInput(scan,"Choose a digit.","0123456789");
	
	System.out.println("You entered '"+input+"'");
  
      
  }
//first instance for getInput
public static char getInput(Scanner scan, String Cc)
{
	boolean control = false;//control variable
	int length;
	char input = 'd';
	String str;


bigLoop: while (control == false){ //outer loops that allows for exiting precisly
	//all of the variables needed for calculations
	str = scan.next();
	length = str.length();
	input = str.charAt(0);//length of character
	while (length != 1){//make sure only one character is enetered
		 System.out.println("You should enter exactly one character- ");
		 break;
	}
	while ((input != 'C' && input != 'c') && length==1) {//make sure the right character is taken.  Check length to prevent repeats in output
		 System.out.println("You did not enter a character from the list 'Cc'; try again- ");
		 break;
	}
	while (input == 'C' || input == 'c'){
		break bigLoop;//break out and go to the return
	}
}
return input;
}
//second instabce for getInput
int x =5; //int for the method's argument
public static char getInput(Scanner scan, String yYnN, int x)
{
	boolean control = false; //control variable
	int length;
	char input = 'd';
	String str;
	int counter = 0;


bigLoop: while (control == false && counter < 5){//outer loops that allows for exiting precisly
	//all of the variables needed for calculations
	counter++; //counter to determine when 5 mistakes are made
	str = scan.next();
	length = str.length();
	input = str.charAt(0);//length of character
	
	while (counter == 5){
		System.out.println("You failed after 5 tries");
		input = ' ';
		break bigLoop;
	}
	
	while (length != 1){//make sure only one character is enetered
		 System.out.println("You should enter exactly one character- ");
		 break;
	}
	while ((input != 'Y' && input != 'y' && input != 'n' && input != 'N') && length==1) {//make sure the right character is taken.  Check length to prevent repeats in output
		 System.out.println("You did not enter a character from the list 'yYnN'; try again- ");
		 break;
	}
	while (input == 'N' || input == 'n' || input == 'Y' || input == 'y'){
		break bigLoop;//break out and go to the return
	}				
		
}
return input;
}
String num3 = "0123456789"; //one of the strings for the argument
String numDigit = "Choose a digit";//other string for the argument

public static char getInput(Scanner scan, String numDigit, String num3) //outer loops that allows for exiting precisly
{
	boolean control = false;//control variable
	int length;
	char input = 'd';
	String str;

System.out.println("Choose a digit.");
bigLoop: while (control == false){
  //all of the variiables needed for calculations
	str = scan.next();
	length = str.length();
	input = str.charAt(0); //length of character
	while (length != 1){ //make sure only one character is enetered
		 System.out.println("You should enter exactly one character- ");
		 break;
	}
	while ((input != '1' && input != '2' && input != '3' && input != '4' && input != '5' && input != '6' && input != '7' && input != '8' && input != '9') && length==1) {
		 System.out.println("You did not enter an accpetable character ");//make sure the right character is taken.  Check length to prevent repeats in output
		 break;
	}
	while (input == '0' || input == '1' || input == '2' || input == '3' || input == '4' || input == '5' || input == '6' || input == '7' || input == '8' || input == '9'){
		break bigLoop;//break out and go to the return
	}
}
return input;
}
	




}







	
/*	int length = str.length();
				if(length == 1){	
}
	else{
					System.out.println("You should enter exactly one character- ");
					break;
				} */

/*public static int getInput(int input)
{
    input = scan.nextInt();*/
    




