package jyoti_practice.collections.sets;

import java.util.TreeSet;

public class ComparableImp {
    public static void main(String[] args) {
        TreeSet<Student> stud = new TreeSet<>();
        stud.add(new Student(29,"LAl"));
        stud.add(new Student(95,"Ayoti1"));
        stud.add(new Student(67,"Byoti2"));
        stud.add(new Student(50,"Cyoti3"));
        stud.add(new Student(85,"Dyoti"));
        stud.add(new Student(75,"Eyoti"));

        System.out.println(stud);


    }
}
class Student implements Comparable<Student>{
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    String name;

    @Override
    public int compareTo(Student o) {
        return o.age-this.age;
    }
}