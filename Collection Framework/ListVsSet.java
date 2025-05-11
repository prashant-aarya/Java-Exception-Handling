import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ListVsSet
{
    public static void main(String[] args) 
    {
        /*List is a Interface we can not create object but we can create object of ArrayList which is implemented 
        class of List Interface --- List is allows duplicate elements,It is an Ordered Collection it maintain the 
        insertion order --List allows many no. of null values, List Implementation : ArrayList,LinkedList,Vector and Stack */
       
        List<String> nameList=new ArrayList<>();

        nameList.add("Java Programming");
        nameList.add("C++ Programming");
        nameList.add("null");
        nameList.add("Python Programming");
        nameList.add("C Programming");
        nameList.add("null");
        nameList.add("null");
        nameList.add("MySql");
        nameList.add("Java Programming");

        System.out.println("List : "+nameList);

        //OutPut
        //List : [Java Programming, C++ Programming, null, Python Programming, C Programming, null, null, MySql, Java Programming]
       

        //-------------------------------------------------------------------------------------------------------------------------

        /* Set is also a Interface ,We can't Create object of Set but we can create Object LinkedHashSet,HashSet
           Set doesn't allow duplicate element , Set is an unorder Collection, insertion order is  not maintain any order
           Set Implementation : Hashset,LinkedHashSet,TreeSet; -- Sert Can have only a single null value at most
        */

        Set <String> nameSet=new HashSet<>();

        nameSet.add("Java Programming");
        nameSet.add("C++ Programming");
        nameSet.add("null");
        nameSet.add("Python Programming");
        nameSet.add("C Programming");
        nameSet.add("null");
        nameSet.add("null");
        nameSet.add("MySql");
        nameSet.add("Java Programming");
        
        System.out.println("HashSet : "+nameSet);


        //Input same but output diffrent
        //Set : [null, MySql, Java Programming, C++ Programming, Python Programming, C Programming]



        //-------------------------------------------------------------------------------------------------

       
       //it store value according to insertion order because now we use LinkedHashSet but Dublicate ab bhe nhi aayege

        Set <String>nameSet1=new LinkedHashSet<>();

        nameSet1.add("Java Programming");
        nameSet1.add("C++ Programming");
        nameSet1.add("null");
        nameSet1.add("Python Programming");
        nameSet1.add("C Programming");
        nameSet1.add("null");
        nameSet1.add("null");
        nameSet1.add("MySql");
        nameSet1.add("Java Programming");
        
        System.out.println("Use Of LinkedHashSet : "+nameSet1);

        //Output
       // Set : [Java Programming, C++ Programming, null, Python Programming, C Programming, MySql]


       //----------------------------------------------------------------------------------------------

        // We can not insert null in TreeSet and It will sort the element 

       Set <String> nameSet2=new TreeSet<>();

        nameSet2.add("Java Programming");
        nameSet2.add("C++ Programming");
        nameSet2.add("null");
        nameSet2.add("Python Programming");
        nameSet2.add("C Programming");
        nameSet2.add("null");
        nameSet2.add("null");
        nameSet2.add("MySql");
        nameSet2.add("Java Programming");
        
        System.out.println("Use of TreeSet : "+nameSet2);


        //Sorted Output
        //Use of TreeSet : [C Programming, C++ Programming, Java Programming, MySql, Python Programming, null]

    


    }
    
}
