package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(0, 6);
        // arr.remove(0);
        for(int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i)*2);
            System.out.println(arr.get(i));
        }
        arr.clear();
    }
}
