package Lab09;

import java.util.Scanner;

public class Lab09g
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);

        System.out.print("Enter a word:  ");
        String sent = kBoard.nextLine();
        System.out.print("Enter a character you would like to remove:  ");
        String remove = kBoard.nextLine();

        int i = sent.length();
        int loc = sent.indexOf(remove);

        while(loc != -1){
            sent = sent.substring(0, loc-1)+ sent.substring(loc+remove.length());
            loc=sent.indexOf(remove);
        }
        System.out.println(sent);


    }
}
