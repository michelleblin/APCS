package Lab08;

import java.util.Scanner;

public class Lab08b
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);
        System.out.print("Enter a number to start at:   ");
        int start = kBoard.nextInt();
        System.out.print("Enter a number to stop at:   ");
        int stop = kBoard.nextInt();
        System.out.print("Enter a skipping amount:   ");
        int skip = kBoard.nextInt();

        for(int i=start; i<stop; i+=skip){
            System.out.println(i +" ");
        }
    }
}
