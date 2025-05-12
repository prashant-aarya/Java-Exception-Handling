public class ExceptionHandel1 
{
    public static void main(String[] args) 
    {
        ExceptionHandel1 eh=new ExceptionHandel1();
        try
        {
            eh.divide();
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println("Prashant Arya");
    }
    void divide()
    {
        int a=100,b=0,c;
        c=a/b;
        System.out.println(c);
    }
    
}



/*java.lang.ArithmeticException: / by zero
	at ExceptionHandel1.divide(ExceptionHandel1.java:19)
	at ExceptionHandel1.main(ExceptionHandel1.java:8)
Prashant Arya */