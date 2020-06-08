public class BankAccount
{
  private double balance;
  private String name;

  public BankAccount(String name, double balance)
  {
    this.name = name;
    this.balance = balance;
  }

  public void deposit(double amt)
  {
    balance += amt;
  }

  public void withdrawl(double amt)
  {
    balance -= amt;
  }

  public double getBalance()
  {
    return balance;
  }

  public String getName()
  {
    return name;
  }

}
