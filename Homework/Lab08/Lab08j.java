package Lab08;

import java.util.Scanner;

public class Lab08j
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Enter your binary:  ");
        String binary = kBoard.nextLine();

        int total = 0;
        for(int i=0; i<binary.length(); i++){
            String current = binary.substring(binary.length()-i-1, binary.length()-i);
            int cur = Integer.parseInt(current);

            total += cur * Math.pow(2, i);
        }
        System.out.print(binary + " base 2 == " + total+" base 10");
    }
}
