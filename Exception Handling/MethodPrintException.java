public class MethodPrintException 
{
    public static void main(String[] args) 
    {
        try
        {
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();                                                            //Exception Name/descripition/stackTrace
            System.out.println("---------------------------------------");
            System.out.println(e);                                                           //Exception Name/descripition
            System.out.println("---------------------------------------");
            System.out.println(e.toString());                                                //Exception Name/descripition
            System.out.println("---------------------------------------");
            System.out.println(e.getMessage());                                              //descripition

        }
    }
    
}


/*java.lang.ArithmeticException: / by zero                                  
	at MethodPrintException.main(MethodPrintException.java:8)
---------------------------------------
java.lang.ArithmeticException: / by zero        
---------------------------------------
java.lang.ArithmeticException: / by zero
---------------------------------------
/ by zero */