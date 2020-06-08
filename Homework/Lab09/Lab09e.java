package Lab09;

import java.util.Scanner;

public class Lab09e
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);

        System.out.println("Enter a number:  ");
        int num = kBoard.nextInt();

        String div = "";
        int i=1;
        while(i<num){
            if(num%i == 0){div += " "+i;}
            i++;
        }
        System.out.println(num+" has divisors " + div);
    }
}
