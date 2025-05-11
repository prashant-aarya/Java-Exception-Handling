package String;

public class ImmutableObject 
{
    public static void main(String[] args) 
    {
        String x="abc";
        String y="xyz";

        //x.concat(y);
        //System.out.println(x);  Output : abc  
        
        String z=x.concat(y);
        System.out.println(z);    // Output : abcxyz

        x=x.concat(y);
        System.out.println(x);    // Output : abcxyz
    }
    
}
