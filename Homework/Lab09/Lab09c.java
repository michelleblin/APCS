package Lab09;

import java.util.Scanner;

public class Lab09c
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);
        System.out.print("Enter a number:   ");
        int num = kBoard.nextInt();

        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
