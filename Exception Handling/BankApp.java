import java.util.Scanner;

class Bank{
    int balance=5000;
    void withdraw(int amount)throws Exception
    {
        if(amount>balance)
        {
            throw new Exception("Insuficient Balance ! ");
        }
        else
        {
            balance-=amount;
            System.out.println("Withdraw successful.\nRemaining Balance : - "+balance);
        }
    }
}
public class BankApp 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Bank b=new Bank();
        System.out.print("Enter amount to withdraw :- ");
        int amount = sc.nextInt();
        try
        {
            b.withdraw(amount);
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            sc.close();
            System.out.println("Thankyou for using our ATM");
        }
    }
    
}


/*Enter amount to withdraw :-
6000
Error : Insuficient Balance ! 
Thankyou for using our ATM */

/*Enter amount to withdraw :- 3500
Withdraw successful.
Remaining Balance : - 1500
Thankyou for using our ATM */