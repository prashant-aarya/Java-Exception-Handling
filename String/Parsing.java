package String;

public class Parsing {
    public static void main(String[] args) {
        String x="40";
        System.out.println("String : "+(x+10));                   //String  Output --> 4010

        int y=Integer.parseInt(x);                               // Convert String to---> int 
        double z=Double.parseDouble(x);                          // Convert String to ---> double
        System.out.println("Integer : "+(y+10));
        System.out.println("Double value : "+(z+10));
    }
    
}
