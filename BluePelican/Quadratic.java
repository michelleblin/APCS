public class Quadratic
{
  public static void main(String[] args)
  {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    System.out.println(quadFormula(a, b, c));

    // for the second method

    // double[] ans = quadFormula(a, b, c);
    // System.out.println(ans[0] + " or " + ans[1]);

  }

  public static double quadFormula(double a, double b, double c)
  {
    return (0-b + Math.sqrt(b*b-4*a*c))/(2*a);
  }

  // public static double[] quadFormula(double a, double b, double c)
  // {
  //   double[] ans = new double[2];
  //   ans[0] = (0-b + Math.sqrt(b*b-4*a*c))/(2*a);
  //   ans[1] = (0-b - Math.sqrt(b*b-4*a*c))/(2*a);
  //   return ans;
  // }
}
