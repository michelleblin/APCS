public class Lab14g
{
  public static void main(String[] args) {
    int[] arr1 = {3, 3, 3, 3, 3, 9, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
    int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] arr3 = {1, 1, 1, 2, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 4, 4, 4, 6};
    // groupPrinter(arr1);
    // groupPrinter(arr2);
    groupPrinter(arr3);
  }

  public static int[] arrCounter(int[] arr)
  {
    int[] groupArr = new int[arr.length];
    int cnt = 1;
    for(int i=0; i<arr.length; i++)
    {
      if(i != 0 && arr[i] == arr[i-1])
        cnt++;
      else
        cnt = 1;
      groupArr[cnt-1]++;
    }
    return groupArr;
  }

  public static void groupPrinter(int[] arr)
  {
    int[] groupArr = arrCounter(arr);
    for(int i=0; i<groupArr.length; i++)
    {
      if(groupArr[i] != 0)
        System.out.println("size " + (i+1) + " count == " + groupArr[i]);
    }
  }
}
