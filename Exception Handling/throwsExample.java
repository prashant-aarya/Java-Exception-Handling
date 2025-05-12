public class throwsExample 
{
    public static void main(String[] args) 
    {
        divisiondemo(10,0);
    }
    public static void divisiondemo(int divident,int divisor) throws ArithmeticException
    {
        System.out.println("The Result is : "+divident/divisor);
    }
    
}
// Use Of throws

/*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at throwsExample.divisiondemo(throwsExample.java:9)
        at throwsExample.main(throwsExample.java:5) */