package Lab09;

import java.util.Scanner;

public class Lab09i
{
    public static void main(String[] args)
    {
        final String FINDER = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Scanner kboard = new Scanner(System.in);
        System.out.print("Original number:  ");
        int original = kboard.nextInt();
        System.out.print("New Base:  ");
        int base = kboard.nextInt();
        String newNum = "";

        int dec = original;

        while(dec>0)
        {
            int remainder = dec%base;
            newNum = FINDER.substring(remainder, remainder+1) + newNum;
            dec = dec/base;
        }
        System.out.println(original + " base 10 is " + newNum + " base " + base);
    }
}
