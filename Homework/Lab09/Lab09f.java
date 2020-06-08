package Lab09;

import java.util.Scanner;

public class Lab09f
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);

        System.out.println("Enter a word:  ");
        String word = kBoard.nextLine();
        System.out.println("Enter a character you would like to remove:  ");
        String remove = kBoard.nextLine();

        int i = word.length();
        int loc = word.indexOf(remove);

        while(i>0){
            word = word.substring(0, loc)+ word.substring(loc+1);
            loc=word.indexOf(remove);
            if (loc==-1){break;}
            i--;
        }
        System.out.println(word);
    }
}
