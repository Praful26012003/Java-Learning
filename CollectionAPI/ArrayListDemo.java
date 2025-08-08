package CollectionAPI;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String[] args) {

        Comparator<String> comp = new Comparator<String>() {
            public int compare(String a, String b) {
                if(a.length() > b.length())
                    return 1;
                return -1;
            }
        };

        List<String> names = new ArrayList<>();
        names.add("Praful");
        names.add("Nole");
        names.add("Deepa");
        names.add("DN");
        names.add("Ram");
        names.add("Navneet");

        Collections.sort(names, comp);
        System.out.println(names);
    }
}
 