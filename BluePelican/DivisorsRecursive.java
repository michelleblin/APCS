import java.util.Scanner;

public class DivisorsRecursive {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("What is the number?  ");
        int n = kb.nextInt();
        divisors2(n, 1, n/2);
    }

    public static void divisors(int n, int d)
    {
        if(d > n/2){}
        else if(n%d==0)
        {
            System.out.print(d +" ");
            divisors(n, d+1);
        } 
        else 
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