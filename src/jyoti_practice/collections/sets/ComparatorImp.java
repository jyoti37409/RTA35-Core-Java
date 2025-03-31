package jyoti_practice.collections.sets;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorImp {
    public static void main(String[] args) {
        TreeSet<Student1> stud = new TreeSet<>(new StudentComparatorByAge());
        stud.add(new Student1(29,"LAl"));
        stud.add(new Student1(95,"Ayoti1"));
        stud.add(new Student1(67,"Byoti2"));
        stud.add(new Student1(50,"Cyoti3"));
        stud.add(new Student1(85,"Dyoti"));
        stud.add(new Student1(75,"Eyoti"));

        System.out.println("Comparing with age::"+ stud);

        TreeSet<Student1> stud1 = new TreeSet<>(new StudentComparatorByName());
        stud1.add(new Student1(29,"LAl"));
        stud1.add(new Student1(95,"Ayoti1"));
        stud1.add(new Student1(67,"Byoti2"));
        stud1.add(new Student1(50,"Cyoti3"));
        stud1.add(new Student1(85,"Dyoti"));
        stud1.add(new Student1(75,"Eyoti"));

        System.out.println("Comparing with name :: " + stud1);



    }
}
class Student1{
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    String name;
}
class  StudentComparatorByAge implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        //return Integer.compare(o1.age, o2.age);
        return Integer.compare(o2.age, o1.age );
    }
}
class StudentComparatorByName implements  Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o2.name.compareTo(o1.name);
    }
}
