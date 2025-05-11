/*ArrayList is Dynamic in Size ,It can be resized itsef when needed ,We can't store primitive type in arraylist
  We can Store diffrent type of element.*/

  import java.util.ArrayList;
import java.util.Collections;
class ArrayLists
{
    public static void main(String [] args)
    {

        //ArrayList<String> list = new ArrayList<String>();
        //ArrayList<Boolean> list= new ArrayList<>();
        ArrayList <Integer> list = new ArrayList<Integer>();

        //add element
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println("list.add : "+list);

        //get elements
        int a=list.get(2);
        int b=list.get(3);
        System.out.println("list.get : "+a);
        System.out.println("list.get : "+b);

        //add element in between
        list.add(4, 10);
        System.out.println("Between : "+list);

        //set element
        list.add(0, 23);
        System.out.println("O Index : "+list);


        //delete element 
        list.remove(0);
        System.out.println("After Remove : "+list);


        //Size
        int size=list.size();
        System.out.println("Size of List : "+size);


        //loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
       

        //Sorting 
        Collections.sort(list);
        System.out.println("Sort Element : "+list);

    
    }
}