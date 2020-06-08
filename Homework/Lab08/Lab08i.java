package Lab08;

import java.util.Scanner;

public class Lab08i
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Enter a number to find out if it is prime:  ");
        int num = kBoard.nextInt();

        boolean isPrime = true;
        for (int i=2; i<num/2; i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime || num == 2){System.out.println(num+" is prime");}
        else{System.out.println(num+" is not prime");}
    }
}
