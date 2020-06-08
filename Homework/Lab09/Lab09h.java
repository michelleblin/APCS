package Lab09;

import java.util.Scanner;

public class Lab09h
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);

        System.out.println("Enter a number:  ");
        int num = kBoard.nextInt();

        int total = 0;
        int i=1;
        while(i<num){
            if(num%i == 0){total += i;}
            i++;
        }
        if (total == num){System.out.println(num + " is perfect");}
        else{System.out.println(num + " is not perfect");}
    }
}
