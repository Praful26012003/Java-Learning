package collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.addFirst(10);
        arr.addLast(12);
        System.out.println(arr);
    }
}
