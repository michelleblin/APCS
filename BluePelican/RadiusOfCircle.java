import java.util.Scanner;

public class RadiusOfCircle
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("What is the area? _ ");
    double area = kboard.nextDouble();
    double radius = Math.sqrt(area/Math.PI);

    System.out.println("Radius of your circle is " + radius +".");
  }
}
