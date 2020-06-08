import java.util.Scanner;

public class Lab08k
{
    public static void main(String args[]){
        Scanner kBoard = new Scanner(System.in);
        System.out.print("Enter your first number:   ");
        int first = kBoard.nextInt();
        System.out.print("Enter your second number:   ");
        int second = kBoard.nextInt();

        int gcf = 1;
        for(int i=1; i<=first; i++)
        {
            if (i>second)
                break;
            if (first%i == 0 && second%i == 0)
                gcf = i;
        }
        System.out.println("the gcd of "+first+ " and " + second + " is " + gcf);

    }
}
