public class ModFib
{
    public static int modFibonacci(int n)
    {
        if(n==0)
            return 3;
        else if (n==1)
            return 5;
        else if (n==2)
            return 8;
        return modFibonacci(n-1) + modFibonacci(n-2) + modFibonacci(n-3);
    }
}