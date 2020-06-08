public class Lab14e
{
    public static void main(String[] args)
    {
        int[] arr = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
        int[] countArr = count(arr);
        for(int i = 0; i<countArr.length; i++){
            System.out.println(countArr[i]);
        }
    }
    
    public static int[] count(int[] arr)
    {
        int[] counterArr = new int[10];
        
        for(int i = 0; i<arr.length; i++)
        
            counterArr[arr[i]]++;
        
        
        return counterArr;
    }
}