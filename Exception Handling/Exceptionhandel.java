public class Exceptionhandel 
{
    public static void main(String[] args) 
    {
        Exceptionhandel eh=new Exceptionhandel();
        eh.divide();
    }
    void divide()
    {
        try 
        {
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Prashant Arya");
    }
    
}



/*java.lang.ArithmeticException: / by zero
	at Exceptionhandel.divide(Exceptionhandel.java:13)
	at Exceptionhandel.main(Exceptionhandel.java:6)
Prashant Arya */