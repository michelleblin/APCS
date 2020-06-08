package Lab08;

import java.util.Scanner;

public class Lab08h
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Enter a number you would like to factorial:  ");
        long num = kBoard.nextLong();

        int factorial = 1;
        for (int i=num; i>0; i--)
            factorial *= i;

        System.out.println("factorial of " + num+" is "+ factorial);
    }
}
