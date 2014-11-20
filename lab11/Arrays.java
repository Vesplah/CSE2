//Ryan Judge

//November 14

//lab11

//This program is designed to help us practice with arrays

import java.util.Scanner;
public class Arrays{
    public static void main(String []s){
        Scanner scan = new Scanner(System.in);
        int[] numbers;
        int array = 10;
        System.out.println("Enter 10 ints: ");
        numbers = new int[array];
            numbers[0] = scan.nextInt();
            numbers[1] = scan.nextInt();
            numbers[2] = scan.nextInt();
            numbers[3] = scan.nextInt();
            numbers[4] = scan.nextInt();
            numbers[5] = scan.nextInt();
            numbers[6] = scan.nextInt();
            numbers[7] = scan.nextInt();
            numbers[8] = scan.nextInt();
            numbers[9] = scan.nextInt();
        System.out.println(numbers[9]);
    }
}