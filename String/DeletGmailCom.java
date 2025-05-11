package String;

import java.util.Scanner;

public class DeletGmailCom 
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter Email Id : - ");
    String email=sc.next();
    String userName= "";

    for(int i=0;i<email.length();i++)
    {
        if(email.charAt(i)=='@')
        {
            break;
        }
        userName+=email.charAt(i);
    }
    System.out.println(userName);
    }
    
}
