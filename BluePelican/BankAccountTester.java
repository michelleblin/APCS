import java.util.Scanner; 
import java.util.Arrays; 

public class BankAccountTester
{
    public static void main(String[] args){
        String name;
        BankAccount[] bank = new BankAccount[5];
        for(int i=0; i<bank.length; i++)
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. ");
            name = kbReader.nextLine();
            System.out.print("Please enter the amount of the deposit. "); 
            double amount = kbReader.nextDouble(); 
            System.out.println(); 
            BankAccount ba = new BankAccount(name, amount);
            bank[i] = ba;
        }

        Arrays.sort(bank);
        for(BankAccount ba: bank)
            System.out.println(ba.getName() +" >>> " + ba.getBalance());
    }

    // public static void sort(BankAccount[] arr)
    // {
    //     BankAccount min; 
    //     int minIndex;
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         min =  arr[i];
    //         minIndex = i;
    //         for(int j=i+1; j<arr.length; j++)
    //         if(arr[j].compareTo(min) < 0)
    //         {
    //             min=arr[j];
    //             minIndex=j;
    //         }
    //         arr[minIndex] = arr[i]; 
    //         arr[i] = min;
    //     }
    // }
}