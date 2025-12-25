import java.util.*;

public class LinkedListEquality {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1); list1.add(2); list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1); list2.add(2); list2.add(3);

        if(list1.equals(list2))
            System.out.println("Both LinkedLists are Equal");
        else
            System.out.println("LinkedLists are NOT Equal");
    }
}
