//Ryan Judge
//September 23
//hw 04 program 3
//This homework is designed to have us practice selection statements, comparison operators and Booleans

import java.util.Scanner; //new scanner

public class CourseNumber { //declare class
    public static void main(String [] args) { //declare main method

Scanner myScanner;
    myScanner = new Scanner( System.in ); //name new scanner
    
System.out.print("Enter a six digit number givng the course semester ");
    boolean Int = myScanner.hasNextInt();
    int number = myScanner.nextInt();
if (Int == true){
    if ((186510 <= number) && (number <= 201440)) {
        String courseString = Integer.toString(number);
        String semester = courseString.substring (4);
        String year = courseString.substring(0, courseString.length() - 2);

      
        if (semester == "10") {
            semester = "Spring";
        }
        else if (semester == "20"){
            semester = "Summer 1";
              
        }
        else if (semester == "30"){
            semester = "Summer 2";
        }
        else if (semester == "40"){
            semester = "Fall";
        }
        System.out.println("The course was offered in " + semester + " semester of " +year);
       
       
}

    else {
        System.out.println("Not in range");
        return;
            }
}
else{
    System.out.println("Please enter an integer");
    return;
       }



    }
}