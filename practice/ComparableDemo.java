package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age : " + age + ", name : " + name + "]";
    }

    public int compareTo(Student that) {
        if(this.age > that.age) return 1;
        return -1;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
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

        Collections.sort(students);
        System.out.println(students);
    }
}
