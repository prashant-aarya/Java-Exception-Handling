public class Test1Solution 
{
    public static void main(String[] args) 
    {
        System.out.println("Main method started");
        int a=10,b=0,c;
        try
        {
            c=a/b;                             //Risky Code
            System.out.println(c);
        }
        catch(Exception e)                     //catch(ArithmeticException e) if know 
        {
            System.out.println(e);             //S.o.p("Can't divided by Zero");
        }
        System.out.println("Main method ended");
    }
    
}


/*
Output : -
Main method started                                         Program/Execution will not disturb
java.lang.ArithmeticException: / by zero
Main method ended 
*/