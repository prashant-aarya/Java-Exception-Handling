package String;
import java.util.Scanner;
public class nextFun 
{
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc=new Scanner(System.in);

        //String name1 = sc.next();                         //----> Get only Single Word
        //System.out.println("next() :- "+name1);


        String name2=sc.nextLine();             //----> Print Complete String
        System.out.println("nextLine() :- "+name2);
    }   
}
