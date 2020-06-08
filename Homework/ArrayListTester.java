import java.util.ArrayList;

public class ArrayListTester
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(2);
        arr.add(7);
        arr.add(1);
        arr.add(3);
        arr.add(8);
        arr.add(4);
        arr.add(9);
        arr.add(6);
        for(int a: arr)
            System.out.print(a +" ");
        System.out.println();
        // solution 1
        // for(int i=0; i<arr.size(); i++)
        //     if(arr.get(i)%2!=0)
        //     {
        //         arr.remove(i);
        //         i--;
        //     }

        // solution 2
        for(int i=arr.size()-1; i>=0; i--)
            if(arr.get(i)%2!=0)
                arr.remove(i);
            
        // arr.removeIf(i -> i % 2 != 0);
        for(int a: arr)
            System.out.print(a +" ");
    }
}