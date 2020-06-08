public class Problem1
{
  public static void main(String[] args)
  {
    int sum = 0;
    int num = 1;
    while(num<1000){
      if(num%3==0)
        sum += num;
      else if (num%5==0){
        sum += num;
      }
      num++;
    }
    System.out.println(sum);

    // Problem 2

    /* int n1 = 1;
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
    System.out.println(sum); */



    // Problem 6

    /* int sumOfSquare = 0;
    int squareOfSum = 0;
    int num = 1;

    while(num<=100){
      sumOfSquare += num*num;
      squareOfSum += num;
      num++;
    }
    System.out.println(squareOfSum * squareOfSum - sumOfSquare); */
  }
}
