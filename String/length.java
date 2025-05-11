package String;

import java.util.Scanner;

public class length 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of string : ");
        int size=sc.nextInt();
        sc.nextLine();                                        //Fix for input issue 
        String [] arr=new String [size];
        System.out.println("Enter Array String : ");
        int len=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextLine();
            len+=arr[i].length();
        }
        System.out.println(len);
    }
    
}
