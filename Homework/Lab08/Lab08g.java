package Lab08;

import java.util.Scanner;

public class Lab08g
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);
        System.out.print("Enter a number to start:   ");
        int start = kBoard.nextInt();
        System.out.print("Enter a number to stop:   ");
        int stop = kBoard.nextInt();

        int total = 0;
        int odd = 0;
        int even = 0;
        for(int i=start; i<=stop; i++){
            total += i;
            if(i%2==0)
              even +=i;
            else
              odd += i;
        }
        System.out.println("total  "+total);
        System.out.println("odds   "+odd);
        System.out.println("even   "+even);
    }
}
