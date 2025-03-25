package jyoti_practice.collections;

import java.util.HashSet;
import java.util.Objects;

public class HashSetRemovingDuplicatesInCustomClass {
    public static void main(String[] args) {

        HashSet<Student> stud = new HashSet<>();
        stud.add(new Student(1,"Jyoti56"));
        stud.add(new Student(2,"Jyoti2"));
        stud.add(new Student(3,"Jyoti3"));
        stud.add(new Student(4,"Jyoti4"));
        stud.add(new Student(1,"Jyoti5"));

        for(Student student:stud){
            System.out.println(student);
        }

    }
}
class Student{
    int Id;
    String name;
    public Student(int studentId,String studentname){
        this.Id =studentId;
        this.name = studentname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Id == student.Id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name);
    }
}
