public class BinarySearch
{
    public static void main(String[] args) {
        // int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        // System.out.println(reverseBS(arr, 10));

        Integer[] a = {-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97};
        System.out.println(binarySearch(a, 49));
        System.out.println(binarySearch(a, 22));
        System.out.println(binarySearch(a, 89)); 
        System.out.println(binarySearch(a, 72));  
        System.out.println(binarySearch(a, 102));
    }

    public static int reverseBS(int[] arr, int srchVal)
    {
        int lb = 0;
        int ub = arr.length-1;
        
        while(lb<=ub)
        {
            int mid = (lb + ub)/2; 
            if(arr[mid] == srchVal) 
                return mid; 
            else if (srchVal < arr[mid]) 
                lb = mid + 1; 
            else 
                ub = mid - 1;  
        
        }
        return -1;
    }

    public static int binarySearch(Object[] arr, Object srchVal)
    {
        int lb = 0;
        int ub = arr.length-1;
        
        while(lb<=ub)
        {
            int mid = (lb + ub)/2; 
            int c = ((Comparable)arr[mid]).compareTo(srchVal);
            if(c == 0) 
                return mid; 
            else if(c < 0) 
                lb = mid + 1;
            else 
                ub = mid - 1; 
        }
        return -1;
    }
}