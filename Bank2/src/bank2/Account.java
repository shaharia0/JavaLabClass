package bank2;
public class Account {
    public String  name;
    public String AccID;
    public double balance;
    
    public Account (String N, String Acc, double B)
    {
    name = N;
    AccID = Acc;
    balance = B;
    }
    public double deposite (double amount )
    {
        balance = balance + amount ;
        return balance ;
    } 
public double withdraw (double amount ){
    balance = balance - amount ;
    return balance;
}
}
