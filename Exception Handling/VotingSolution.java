import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
    YoungerAgeException(String msg)
    {
        super(msg);
    }
}
public class VotingSolution
{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Your Age :- ");
        int age = s.nextInt();
        try
        {
            if(age<18)
            {
                throw new YoungerAgeException("You are not eligible for voting");
            }
            else
            {
                 System.out.println("You can vote Successfully");
            }
        }
        catch(YoungerAgeException e)
        {
            e.printStackTrace();
        }
        System.out.println("Prashant Arya");
    }
    
}



/*Enter Your Age :- 
16
YoungerAgeException: You are not eligible for voting
        at VotingSolution.main(VotingSolution.java:19)
Prashant Arya 


Ho gyi exception handel Print Prashant Arya*/