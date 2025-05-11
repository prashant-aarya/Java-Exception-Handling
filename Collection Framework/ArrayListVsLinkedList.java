import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a1=new ArrayList<Integer>();

        a1.add(10);
        a1.add(20);
        a1.add(30);
        System.out.println("ArrayList add : "+a1);

        
        a1.add(1,15);                 //Slow
        System.out.println("ArrayList add Between : "+a1);
        
        
        a1.remove(2);                         //Slow
        System.out.println("ArrayList remove : "+a1);
        
        
        int x=(int)a1.get(2);                            //O(1) --> Fast
        System.out.println("ArrayList Get : "+x);


//--------------------------------------------------------------------------------------------------


        LinkedList l1=new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println("Linkedlist add : "+l1);

        l1.add(1,15);                        //fast
        System.out.println("Linkedlist add between : "+l1);

        l1.remove(2);                                //fast
        System.out.println("Linkedlist remove : "+l1);

        l1.get(2);                                   //O(n) --> Slow
        System.out.println("Linkedlist get : "+l1);
    }
    
}


/*
     Operation                   ArrayList               LinkedList
     ----------------------------------------------------------------

     Access by index             Fast (O(1))             Slow (O(n))

     Insert/Delete at end        Fast                    Fast

     Insert/Delete at middle     Slow                    Fast(O(1))

     Memory Usage                Less                    More 

     Use Case                    Random Access           Frequent insert/delete

     ArrayList : Access Data Fast Chaiye tb use hota hai (index se access) jb bss read krna hai data tb use kre

     LinkedList : Jb list ke middle or Starting mai bar bar data add ya delete krna ho,jha data mai frequent change hote ho

 */