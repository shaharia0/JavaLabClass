package bank2;
public class Bank2
{
    public static void main(String[] args)
    {
        Account obj = new Account("shahariar", "101", 10.0);
        obj.deposite(5000000.0);
        System.out.println("my current balance "+obj.balance);
        obj.withdraw(450000.0);
        System.out.println("my current balance after withdraw"+ obj.balance);
    }
    
}
