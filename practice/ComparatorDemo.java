package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator<Student> cmp1 = new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                if(o1.age > o2.age)
                    return 1;
                return -1;
            }
            
        };

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(23, "Praful"));
        students.add(new Student(20, "Naman"));
        students.add(new Student(30, "Dev"));
        students.add(new Student(26, "Deepak"));
        students.add(new Student(45, "Tilakdhari"));

        Collections.sort(students, cmp1);

        for(Student st : students) {
            System.out.println(st.name + " : " + st.age);
        }
    }
}
