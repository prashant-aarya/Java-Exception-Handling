public class tryFinally 
{
    public static void main(String[] args) 
    {   
        try
        {
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        finally
        {
            System.out.println("I am in finally block");
        }
        System.out.println("Hello Prashant Arya");
        
    }
    
}



/*

I am in finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at tryFinally.main(tryFinally.java:8) 
    
*/


/*
 If we not write catch so program is terminate but But after final block execution
 
 
 try
 {
    risky code
 }
 catch()
 {
    handling code
 }
finally
{
    cleanup code
}
 */