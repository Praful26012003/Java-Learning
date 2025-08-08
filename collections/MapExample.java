package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>(); 
        Map<String, Integer> m2 = new TreeMap<>(); 
        Map<String, Integer> m3 = new LinkedHashMap<>(); 

        m1.put("Praful", 33);
        m1.put("Kishan", 22);
        m1.put("Naman", 23);
        m1.put("Amit", 40);
        m1.put("Deepak", 35);

        m2.put("Praful", 33);
        m2.put("Kishan", 22);
        m2.put("Naman", 23);
        m2.put("Amit", 40);
        m2.put("Deepak", 35);

        m3.put("Praful", 33);
        m3.put("Kishan", 22);
        m3.put("Naman", 23);
        m3.put("Amit", 40);
        m3.put("Deepak", 35);

        // System.out.println(m1);
        // System.out.println(m2);
        // System.out.println(m3);
        System.out.println(m1.get("Nole"));
        System.out.println("****************************************");
        for(String key : m1.keySet()) {
            System.out.println(key + " -> " + m1.get(key));
        }
        System.out.println("****************************************");
        for(String key : m2.keySet()) {
            System.out.println(key + " -> " + m2.get(key));
        }
        System.out.println("****************************************");
        for(String key : m3.keySet()) {
            System.out.println(key + " -> " + m3.get(key));
        }
    }
}
