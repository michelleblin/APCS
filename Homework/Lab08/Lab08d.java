package Lab08;

import java.util.Scanner;

public class Lab08d
{
    public static void main(String args[])
    {
        Scanner kBoard = new Scanner(System.in);
        System.out.print("Enter a word:   ");
        String word = kBoard.nextLine();


        for(int i=word.length(); i>0; i--)
            System.out.println(word.substring(0,i));

    }
}
