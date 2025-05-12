//finally is the block that is always executed whether exception is handled or not

public class finallyBlock 
{
    public static void main(String[] args) 
    {   
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("I am in finally block");
        }
        
    }
}


/* 
Outpur :- 
java.lang.ArithmeticException: / by zero
I am in finally block 

*/

//If exception occure : try ---> catch ---> finally

//If exception does not occur : try ---> finally