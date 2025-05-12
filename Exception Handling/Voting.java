import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
    YoungerAgeException(String msg)
    {
        super(msg);
    }
}
public class Voting 
{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Your Age :- ");
        int age = s.nextInt();
        if(age<18)
        {
            throw new YoungerAgeException("You are not eligible for voting");
        }
        else
        {
            System.out.println("You can vote Successfully");
        }
        System.out.println("Prashant Arya");
    }
    
}



/*Enter Your Age :- 
20
You can vote Successfully
Prashant Arya */


/*Enter Your Age :- 
16
Exception in thread "main" YoungerAgeException: You are not eligible for voting
        at Voting.main(Voting.java:17)
        
        

        Know Exception is not handeled because we not use try/catch in this program So that why 
        Prashant Arya is not printed if age is smaller than 18
*/