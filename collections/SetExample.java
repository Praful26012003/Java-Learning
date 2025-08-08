package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new TreeSet<>();
        Set<Integer> s3 = new LinkedHashSet<>();

        int arr[] = {10, 8, 12, 9, 3, 4};
        s1.add(null);
        s1.add(null);
        s2.add(null);  // error as tree set use sorting mechanism so, can put null
        // s2.add(null);
        s3.add(null);
        s3.add(null);
        for(int i = 0; i < arr.length; i++) {
            s1.add(arr[i]);
            s2.add(arr[i]);
            s3.add(arr[i]);
        }

        System.out.println(s1.contains(3));

        System.out.println("Hashset -> " + s1);
        System.out.println("TreeSet -> " + s2);
        System.out.println("LinkedHashSet -> " + s3);
    }
}
