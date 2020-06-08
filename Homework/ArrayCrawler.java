public class ArrayCrawler
{
  public static void main(String[] args)
  {
    int[] nums1 = { 1, 2, 4, 6, 7, 13, 14};
    int[] nums2 = { 0, 3, 5, 8, 9, 11, 12, 17, 18, 20 };
    System.out.println(lowestCommon2(nums1, nums2));
  }

  public static int lowestCommon1(int[] arr1, int[] arr2)
  {
    for(int i=0; i<arr1.length; i++)
      for(int j=0; j<arr2.length; j++)
        if(arr1[i]==arr2[j])
          return arr1[i];

    return -1;
  }

  public static int lowestCommon2(int[] arr1, int[] arr2)
  {
    int i=0, j=0;
    while(i<arr1.length && j<arr2.length)
      if(arr1[i]==arr2[j])
        return arr1[i];
      else if(arr1[i]>arr2[j])
        j++;
      else
        i++;

    return 2147483647;
  }
}
