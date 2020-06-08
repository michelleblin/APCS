public class Problem6
{
  public static void main(String[] args) {
    int sumOfSquare = 0;
    int squareOfSum = 0;
    int num = 1;

    while(num<=100){
      sumOfSquare += num*num;
      squareOfSum += num;
      num++;
    }
    System.out.println(squareOfSum * squareOfSum - sumOfSquare);
  }
}
