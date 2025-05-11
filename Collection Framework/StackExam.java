//LIFO :- Last In First Out / Linear Data Structure
import java.util.Stack;

public class StackExam 
{
    public static void main(String[] args) 
    {
        Stack <Integer>st=new Stack<>();

        //push Operation
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("All Stack Element : "+st);                            //All Stack Element : [10, 20, 30, 40, 50]

        //Pop Operation
        System.out.println("POP : "+st.pop());                                    //POP : 50

        System.out.println("All Stack Element : "+st);                            // All Stack Element : [10, 20, 30, 40]

        //peek Operation
        System.out.println("peek : "+st.peek());                                  //peek : 40

        //search
        System.out.println("Search : "+st.search(10));                          //peek : 40


        //empty
        System.out.println("Empty : "+st.empty());                                //Empty : false

        st.clear();
        System.out.println("Stack Empty : "+st);                                  //Stack Empty : []

        

    }
    
}
