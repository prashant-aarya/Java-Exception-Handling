package String;

public class Immutable 
{
    public static void main(String[] args) 
    {
        String s = new String ("Prashant ");
         //s.concat("Arya") ;                               ---> Prashant
         s = s.concat("Arya");                              //Prashant Arya
         System.out.println("Name : "+s); 
    } 
}


//Once an object is created ,we can't changes it's content

//If we change the value of String Object then it can't change the original value and 
//if we changes then new object create 