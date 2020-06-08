public class Lab14b
{
  public static void main(String[] args)
  {
    int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};

    System.out.println(goingUp(arr1));
    System.out.println(goingDown(arr1));

    System.out.println(goingUp(arr2));
    System.out.println(goingDown(arr2));
  }

  public static boolean goingUp(int[] arr)
  {
    int temp = arr[0];
    for(int i=1; i<arr.length; i++)
    {
      if(arr[i] < temp)
        return false;
    }
    return true;
  }

  public static boolean goingDown(int[] arr)
  {
    int temp = arr[0];
    for(int i=1; i<arr.length; i++)
    {
      if(arr[i] > temp)
        return false;
    }
    return true;
  }
}
