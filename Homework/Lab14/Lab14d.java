public class Lab14d
{
  public static void main(String[] args)
  {
    double[] arr1 = {100, 90, 85, 72.5, 95.6};
    double[] arr2 = {1, 2 ,3, 4, 5, 6, 7, 8, 9};
    System.out.println(avg(arr1));
    System.out.println(avg(arr2));
  }

  public static double avg(double[] arr)
  {
    double sum = 0;
    for (int i=0; i<arr.length; i++)
      sum += arr[i];
    return sum/arr.length;
  }
}
