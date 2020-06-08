package Lab08;

import java.util.Scanner;

public class Lab08e
{
    public static void main(String args[])
    {
        Scanner kBoard = new Scanner(System.in);
        System.out.print("Enter a number to multiply:   ");
        int mult = kBoard.nextInt();
        System.out.print("Enter the number of times:   ");
        int times = kBoard.nextInt();

        System.out.println("multiplication table for "+mult);
        for(int i=1; i<times+1; i++)
            System.out.println(i+"      "+i*mult);

    }
}
