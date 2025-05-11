//FIFO : First In First Out

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam 
{
    public static void main(String[] args) 
    {
        Queue <Integer> queue=new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Front of queue : "+queue.peek());                   //Front of queue : 10

        queue.remove();

        System.out.println("After removing front : "+queue.peek());              //After removing front : 20

        System.out.println("Is Queue Empty : "+queue.isEmpty());                 //Is Queue Empty : false
        
    }

    
}
