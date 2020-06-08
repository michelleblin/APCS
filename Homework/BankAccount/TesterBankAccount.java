import java.util.Scanner;

public class TesterBankAccount
{
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.print("How much money do you have?    ");
    double balance = kb.nextDouble();
    kb.nextLine();
    System.out.print("What is your name?    ");
    String name = kb.nextLine();

    BankAccount myAccount = new BankAccount(name, balance);
    myAccount.deposit(505.22);
    System.out.println(myAccount.getBalance());
    myAccount.withdrawl(100);
    System.out.println("The " + name + " account balance is, $" + myAccount.getBalance());
  }
}
