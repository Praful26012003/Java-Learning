package practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> num1 = Arrays.asList(1,2,5,4,8,7,11,10);
        int num2[] = new int[10];
        for(int i = 0; i < 10; i++) {
            num2[i] = i+1;
        }
        Stream<Integer> s1 = num1.stream();
        int s2 = s1.filter(num -> num % 2 == 0)
        .map(num -> num*2).reduce(0, (c,e) -> c+e);
        System.out.println(s2);
    }
}
