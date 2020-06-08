import java.util.Arrays;

public class SortingArray
{
  public static void main(String[] args)
  {
    String[] arr = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};

    Arrays.sort(arr);
    System.out.println("Asending\tDesending\n");
    for(int i=0; i<arr.length; i++)
    {
      System.out.println(arr[i]+"\t\t"+arr[arr.length-i-1]);
    }
  }
}
