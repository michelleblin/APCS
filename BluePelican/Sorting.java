public class Sorting
{
    public static void main(String[] args) 
    {
        int arr[] = {4,2,5,1,3,18,0,9,6}; 
        quickSort(arr, 0, arr.length-1);
        for(int j = 0; j < arr.length; j++) 
            System.out.print(arr[j] + " "); 
        System.out.println(); 
    }

    public static void bubbleSort(int[] arr)
    {
        boolean loopSomeMore;
        do
        {
            loopSomeMore=false;
            for(int i=0; i<arr.length-1; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    loopSomeMore=true;
                }
            }
        }while(loopSomeMore);
    }

    public static void selectionSort(int[] arr)
    {
        int min, minIndex;
        for(int i=0; i<arr.length; i++)
        {
            min =  arr[i];
            minIndex = i;
            for(int j=i+1; j<arr.length; j++)
            if(arr[j] < min)
            {
                min=arr[j];
                minIndex=j;
            }
            arr[minIndex] = arr[i]; 
            arr[i] = min;
        }
    }

    public static void insertionSort(int[] arr)
    {
        int curr, j;
        boolean cont;
        for(int i=1; i<arr.length; i++)
        {
            curr=arr[i];
            j=i-1;
            cont=true;
            while(j>=0 && cont)
            {
                if (curr < arr[j] )
                {
                    arr[j + 1] = arr[j]; 
                    j--;
                    if(j == -1)
                        arr[0] = curr;
                }
                else 
                {
                    cont = false;
                    arr[j + 1] = curr; 
                }
            }
        }
    }

    public static void mergeSort (int[] arr, int left, int right)
    {
        if (right == left) 
            return;
        int middle = (left + right) /2; 
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right); 
        merge(arr, left, middle, right); 
    }

    public static void merge(int[] arr, int left, int middle, int right)
    {
        int[] tmpArray = new int[right-left +1];

        int l = left;
        int r = middle + 1; 
        int i = 0;

        while (l <= middle && r <= right)
        {
            if ( arr[l] < arr[r] )
            {
                tmpArray[i] = arr[l];
                l++; 
            }
            else 
            {
                tmpArray[i] = arr[r];
                r++; 
            }
            i++; 
        }
        while(l <= middle)
        {
            tmpArray[i] = arr[l]; 
            l++;
            i++;
        }
        while(r <= right)
        {
            tmpArray[i] = arr[r];
            r++;
            i++; 
        }
        for (i = 0; i < tmpArray.length; i++)
            arr[left + i] = tmpArray[i];
        
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if(left>=right)
            return;
        int k = left;
        int j = right;

        int pivotValue = arr[(left+right)/2];
        while(k<j)
        {
            while(arr[k] < pivotValue)
                k++;
            while(pivotValue < arr[j])
                j--;
            if(k<=j)
            {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k++;
                j--;
            }
        }
        quickSort(arr, left, j);
        quickSort(arr, k, right);
    }
}