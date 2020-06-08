import java.util.Scanner;

public class DistToLineTester
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the A value for the line: ");
    DistToLine.A = kb.nextDouble();
    System.out.print("Enter the B value for the line: ");
    DistToLine.B = kb.nextDouble();
    System.out.print("Enter the C value for the line: ");
    DistToLine.C = kb.nextDouble();
    System.out.print("Enter the x coordinate of the point: ");
    double a = kb.nextDouble();
    System.out.print("Enter the y coordinate of the point: ");
    double b = kb.nextDouble();

    System.out.println("Distance from the point to the line is: " + DistToLine.getDist(a, b));
  }
}
