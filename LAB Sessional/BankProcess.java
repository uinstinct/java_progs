import java.util.*;
class BankAccount
{
    String name;
    String accountNum;
    double balance;  
    String type;
    public void getDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details of bank account");
        name=sc.nextLine();
        accountNum=sc.nextLine();
        balance=sc.nextDouble();
        type=sc.nextLine();
        sc.close();
    }
    public String getAccount()  
    {
        return accountNum;  
    }
    public void printDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+accountNum);
        System.out.println("Balance: "+balance);
        System.out.println("Type: "+type);
    }
}
public class BankProcess extends BankAccount
{
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;                           
    }
    public void withdraw(double amount) 
    {
        double newBalance = balance - amount;
        balance = newBalance;           
    }
     public double getBalance()  
    {
        return balance;     
    }
    
    public static void main(String[] args)
    {
        BankProcess obj= new BankProcess();
        obj.getDetails();
        obj.deposit(10000.0);
        obj.withdraw(5000.0);
        obj.getBalance();
    }
}