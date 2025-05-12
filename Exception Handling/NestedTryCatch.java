import java.util.Scanner;
public class NestedTryCatch 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        try
        {
            System.out.println("I am in first try block");
            try
            {
                arr[6]=10;
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}



/*I am in first try block
java.lang.ArrayIndexOutOfBoundsException: 6
	at NestedTryCatch.main(NestedTryCatch.java:14) */