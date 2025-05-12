public class tryCatch2 
{
    public static void main(String[] args) 
    {
        System.out.println("1");
        try
        {
            int a=100,b=0,c;
            System.out.println("2");
            System.out.println("3");
            c=a/b;
            System.out.println("4");
            System.out.println(c);
            System.out.println("5"); 
        }
        catch(ArithmeticException e)
        {
            System.out.println("6");
            System.out.println(e);
            System.out.println("7");
        }
        System.out.println("Hello Prashant");
   }
    
}



/*

1
2
3
6
java.lang.ArithmeticException: / by zero
7
Hello Prashant



jis line mai error aayegi uske baad vali lines execute nhi hogi direct catch block execute hoga 

*/