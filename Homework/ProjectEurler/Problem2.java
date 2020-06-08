public class Problem2
{
  public static void main(String[] args)
  {
    int n1 = 1;
    int n2 = 2;
    int sum = 0;
    while(n2<4000000)
    {
      if(n2%2 == 0)
        sum += n2;

      int temp = n2;
      n2 += n1;
      n1 = temp;
    }
    System.out.println(sum);
  }
}
