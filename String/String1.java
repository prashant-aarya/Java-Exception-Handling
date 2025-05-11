package String;

public class String1 {
    public static void main(String[] args) {

        String s1=new String("Prashant Arya");  //2 Object Create   String Constant Poll and Heap area
        String s2=new String("Pranav Mishra");  //2 Object Create   String Constant Poll and Heap area
        String s3=new String("Prashant Arya");  //1 Object Create   Only Heap

        String s4="Avinash";            // 1 object Create    String Constant Pool
        String s5="Prashant Arya";      // 0 Object create    
        String s6="Prashant Arya";      // 0 Object Create



       // String Constant Pool is special memory location present in Heap Area which is used 
       // to store String Literal

       // String Constant Pool is used for Future Uses.


    }
    
}
