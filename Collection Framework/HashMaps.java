//HashMap implements Map Interface , it stores the data as key-value pairs
//HashMap doesn't allow dublicate key, but allows dublicate values and it is unordered
//HashMap allows one null key and multiple null values, it is use a hashtable to store key-value pair

import java.util.HashMap;
import java.util.Map;

public class HashMaps 
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> map=new HashMap<>();

        //Insertion
        map.put("Prashant",101);
        map.put("Pranav", 102);
        map.put("Avinash", 103);

        System.out.println(map);                   //-----> {Avinash=103, Pranav=102, Prashant=101}


        map.put("Prashant",205);
        System.out.println(map);                    //---->{Avinash=103, Pranav=102, Prashant=205}


        //Search
        System.out.println(map.containsKey("Prashant"));     //---> true

        //get
        System.out.println(map.get("Prashant"));             //---> 205
        
        //loop
        for(Map.Entry<String,Integer>e:map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //remove
        map.remove("Prashant");
        System.out.println("After Deletion : "+map);

        
    }
    
}
