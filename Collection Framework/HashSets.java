//HashSet implements set interface,not allows dublicate values,it allow only one null element
//HashSet Contain unique elements , Does not maintain insertion order

import java.util.HashSet;
public class HashSets 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set=new HashSet<>(); 

        //Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);                                 //Does not contain dublicate  value
        System.out.println("Elements : "+set);

        //Search
        if(set.contains(1))
        {
            System.out.println("Set Contains 1");
        }
        if(!set.contains(6))
        {
            System.out.println("Does not contain");
        }


        //Delete
        set.remove(1);
         System.out.println("After Remove: "+set);


        //Size
        System.out.println(set.size());

        //Print all elements 
        System.out.println("All element : "+set);
    }
    
}
