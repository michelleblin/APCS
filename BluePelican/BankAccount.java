public class BankAccount implements Comparable
{

    private String name; 
    private double balance;

    public BankAccount(String nm, double amt) 
    {
        name = nm;
        balance = amt;
     }
    public void deposit(double dp) 
    {
        balance = balance + dp; 
    }
    public void withdraw(double wd) 
    {
        balance = balance - wd; 
    }

    public String getName()
    {
        return name;
    }

    public double getBalance()
    {
        return balance;
    }

    public int compareTo(Object other)
    {
        BankAccount otherBA = (BankAccount) other;
        if(balance < otherBA.getBalance())
            return -1;
        else if (balance == otherBA.getBalance())
            return 0;
        else
            return 1;
    }
}