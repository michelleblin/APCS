package Lab08;

import java.util.Scanner;

public class Lab08c
{
    public static void main(String args[])
    {
        Scanner kBoard = new Scanner(System.in);
        System.out.print("Enter a word:   ");
        String word = kBoard.nextLine();


        for(int i=0; i<word.length(); i++)
            System.out.println(word);

    }
}
