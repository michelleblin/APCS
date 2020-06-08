public class Lab14a
{
  public static void main(String[] args)
  {
    int[] arr = {4, 10, 0, 1, 7, 6, 5, 3, 2, 9};
    System.out.println(sum(arr, 3, 6));
    System.out.println(count(arr, 9));
  }

  public static int sum(int[] arr, int start, int end)
  {
    int sum = 0;
    for(int i =start; i<end; i++)
      sum += arr[i];
    return sum;
  }

  public static int count(int[] arr, int num)
  {
    int count = 0;
    for (int i =0; i<arr.length; i++)
    {
      if(arr[i] == num)
        count++;
    }
    return count;
  }
}
