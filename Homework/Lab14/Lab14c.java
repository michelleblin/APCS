public class Lab14c
{
  public static void main(String[] args) {
    int[] arr1 = {154, 2451, 541, 5854, 0};
    int[] arr2 = {-99, -84, -45, -4554, -541, -8742, -12};
    System.out.println(largest(arr1));
    System.out.println(largest(arr2));

  }

  public static int largest(int[] arr)
  {
    int largest = arr[0];
    for(int i=1; i<arr.length; i++)
    {
      if(arr[i] > largest)
        largest = arr[i];
    }
    return largest;
  }
}
