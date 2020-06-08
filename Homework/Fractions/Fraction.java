public class Fraction
{
  private int numerator;
  private int denominator;

  public Fraction(int n, int d)
  {
    numerator = n;
    denominator = d;
  }

  public void print()
  {
    System.out.println(numerator + " / " + denominator);
  }

  public void print2()
  {
    System.out.println(numerator+ "\n---\n" +denominator);
  }

  public boolean isReducible()
  {
    return GCF() != Integer.MAX_VALUE;
  }

  public void reduce()
  {
    int gcf = GCF();
    if(gcf != Integer.MAX_VALUE)
    {
      numerator /= gcf;
      denominator /= gcf;
    }
  }

  private int[] getFactors(int n)
  {
    int currIndex = 0;
    int[] factors = new int[n];
    for(int i=1; i<=n; i++)
      if(n%i==0)
      {
        factors[currIndex] = i;
        currIndex++;
      }

    return factors;
  }

  public int GCF()
  {
    int[] arr1 = getFactors(numerator);
    int[] arr2 = getFactors(denominator);

    int i=0, j=0, largest= Integer.MAX_VALUE;
    while((i<arr1.length && j<arr2.length) && (arr1[i]!=0 || arr2[j]!=0))
      if(arr1[i]==arr2[j])
      {
        largest= arr1[i];
        i++;
        j++;
      }
      else if(arr1[i]>arr2[j])
        j++;
      else
        i++;

    return largest;
  }

  public int getNumerator()
  {
    return numerator;
  }

  public void setNumerator(int newNum)
  {
    numerator = newNum;
  }

  public int getDenominator()
  {
    return denominator;
  }

  public void setDenominator(int newDenom)
  {
    denominator = newDenom;
  }

  public String toString()
  {
    return numerator+" / " + denominator;
  }
}
