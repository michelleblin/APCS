import java.util.Scanner;

public class Divisors
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("What is the number?  ");
        int n = kb.nextInt();
        System.out.print("which optimization level?(1,2,3)  ");
        int level = kb.nextInt();
        int d=1;

        long startTime = System.currentTimeMillis();

        if(level == 1)
        {
            divisors(n, d);
        }   
        else if(level == 2)
        {
            divisors2(n, d, n/2);
        }
        else
        {
            double root = Math.sqrt(n);
            do{
                if(n%d==0)
                    System.out.print(d +" "+n/d+" ");
                d++;
            }while(d <= root);
        }
        long endTime = System.currentTimeMillis( );
        long elaspedTime = endTime - startTime;
        System.out.println("Your algorithm took " + (elaspedTime)/1000.0 + " to run.");
    }

    public static void divisors(int n, int d)
    {
        if(d > n/2)
        {
            System.out.println(n);
            return;
        } 
        else if(n%d==0)
            System.out.print(d +" "); 
        divisors(n, d+1); 
    }

    public static void divisors2(int n, int d, int half)
    {
        if(d > half)
        {
            System.out.println(n);
            return;
        } 
        if(n%d==0)
            System.out.print(d +" "); 
        divisors2(n, d+1, half); 
    }
}