import java.util.Scanner;

public class EvenOrOdd
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);
    int count = 0;

    while(count<3){
      System.out.print("Enter an integer:  ");
      int num = kboard.nextInt();

      if(num%2==0)
        System.out.println("The integer " + num + " is even.");
      else
        System.out.println("The integer " + num + " is odd.");
      count++;
    }
  }
}
