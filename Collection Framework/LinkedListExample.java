import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) 
    {
       LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.addFirst("C++");
        list.addLast("JavaScript");

        System.out.println("LinkedList: " + list);                 //LinkedList: [C++, Java, Python, JavaScript]

        list.remove("Python");
        System.out.println("After removal: " + list);               //After removal: [C++, Java, JavaScript]

        System.out.println("First Element: " + list.getFirst());    //First Element: C++

        System.out.println("Last Element: " + list.getLast());       //
    }
}