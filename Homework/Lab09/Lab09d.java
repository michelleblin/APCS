package Lab09;

import java.util.Scanner;

public class Lab09d
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);
        System.out.print("Enter a number:   ");
        int num = kBoard.nextInt();

        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            sum +=digit;
            num /= 10;
        }

        System.out.println("Sum of digits:  " + sum);
    }
}
