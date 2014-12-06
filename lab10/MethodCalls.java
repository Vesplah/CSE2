
//Ryan Judge

//October 31

//lab10

//This program is designed to help us practice with methods calling other methods

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }   //end of main method
    
    public static int addDigit(int digit, int number)   {
        if (digit>=0 && digit<=9)   {   //fufills conditions of being inclusive between 0 and 9
            number=number+digit;    //add the two value if it is an integer
            return number;  //return the addition of both
        }
        else if (digit>9)   {
            String numberString = String.valueOf(number);   //convert the int to a string
            String value=numberString+digit;    //add the twovalues to gether to get (number)(digit)
            int converted= Integer.parseInt(value); //convert the string to an int
            return converted;
        }
        else if (digit<0 && number<0)   {
            int positiveDigit=Math.abs(digit);   //take absolute value of digit
            int positiveNumber=Math.abs(number);    //take absolute value of number
            String numberString=String.valueOf(positiveNumber);
            String value=numberString+positiveDigit; //add the string value of number to the positive value of digit
            int converted=Integer.parseInt(value);  //convert string to an int
            return converted;   //return negative converted value
        }
        else  {   //if value is negative
            int positive=Math.abs(digit);   //take absolute value of digit
            String numberString=String.valueOf(number);
            String value=numberString+positive; //add the string value of number to the positive value of digit
            int converted=Integer.parseInt(value);  //convert string to an int
            converted=converted*(-1);   //make the value negative again
            return converted;   //return negative converted value
        }
    }   //end of addDigit method
    
    public static int join(int x, int y)   {
        int digit=y;    //switch variable assignment
        int number=x;   //switch variable assignment
        int z=addDigit(digit,number);   //call the previous method addDigit
        return z;
    }   //end of join method
    
}   //end of class  