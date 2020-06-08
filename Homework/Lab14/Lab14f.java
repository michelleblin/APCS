public class Lab14f
{
  public static void main(String[] args)
  {
    System.out.println(fib(3));
    System.out.println(fib(5));

  }

  public static int fib(int numTimes)
  {
    int[] fibNums = new int[numTimes];
    fibNums[0] = 1;
    fibNums[1] = 2;
    for(int i=2; i<fibNums.length; i++)
      fibNums[i] = fibNums[i-1] + fibNums[i-2];
    return fibNums[fibNums.length-1];
  }
}
