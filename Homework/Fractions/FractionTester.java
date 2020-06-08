public class FractionTester
{
  public static void main(String[] args) {
    Fraction f = new Fraction(15, 20);
    f.print();
    System.out.println(f.GCF());
    f.reduce();
    f.print2();
    f.setNumerator(10);
    f.print();
    System.out.println();

    Fraction f2 = new Fraction(105, 975);
    f2.print();
    System.out.println(f2.GCF());
    f2.reduce();
    f2.print2();

  }
}
