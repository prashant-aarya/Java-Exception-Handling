package String;

public class StringToIntAndViceversa 
{   
    public static void main(String[] args) {
        String input ="100";

        System.out.println(" -- Way 1 --");
        int a1=Integer.valueOf(input);                     //String to int
        System.out.println("Int a1 : "+a1);

        String a2 = String.valueOf(a1);                    //int to String
        System.out.println("String a2 : "+a2);


        System.out.println("\n -- Way 2 --");
        int b1=Integer.parseInt(input);                    //String to int 
        System.out.println("Int b1 : "+b1);

        String b2 = Integer.toString(b1);                   //int to String
        System.out.println("String b2 : "+b2);
    }
    
}


// praseInt() : Convert a String directly to a Primitive int /datatype

// valueOf() : Convert a primitive(int) or String into a wrapper object 
//             (like Integer , Double)/primitive to Wrapper

// intValue() : Wrapper / Object to primitive