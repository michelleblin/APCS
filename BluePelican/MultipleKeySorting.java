import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MultipleKeySorting
{
    public static void main (String[] args) throws IOException
    {
        File myfile = new File("Names_ages.txt");
        Scanner filereader = new Scanner(myfile);
        
        String n = ""; 
        while (filereader.hasNext())
        {
            String line = filereader.nextLine();
            line=line.replaceAll("\\s+", ", ");
            n+= line +"|";
        } 

        filereader.close();
        String[] names= n.split("\\|");

        multiKeySort(names);
        for(String name: names)
            System.out.println(name);
    }

    public static void multiKeySort(String[] arr)
    {
        String min;
        int minIndex;
        for(int i=0; i<arr.length; i++)
        {
            min =  arr[i];
            minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                String[] currMin = min.split(",\\s+");
                String[] curr = arr[j].split(",\\s+");
                if(curr[0].compareTo(currMin[0]) < 0 || (curr[0].equals(currMin[0]) && Integer.parseInt(curr[1]) <  Integer.parseInt(currMin[1])))
                {
                    min=arr[j];
                    minIndex=j;
                }

            }
            arr[minIndex] = arr[i]; 
            arr[i] = min;
            
        }
    }
}