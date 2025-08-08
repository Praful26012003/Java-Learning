package CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age : " + age + ", name : " + name + "]";
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
               if(s1.age > s2.age) {
                return 1;    // swap
               }
               return -1;    // don't swap
            }
            
        };

        Student obj1 = new Student(23, "Praful");
        Student obj2 = new Student(18, "Ram");
        Student obj3 = new Student(20, "Shyam");
        Student obj4 = new Student(16, "Ghanshyam");
        Student obj5 = new Student(19, "Nole");

        List<Student> students = new ArrayList<>();
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);

        Collections.sort(students, comp);
        System.out.println(students);
    }
}
