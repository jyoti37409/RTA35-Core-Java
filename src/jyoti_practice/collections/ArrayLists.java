package jyoti_practice.collections;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> stud = new ArrayList<>();
        stud.add("Jaya");
        stud.add("Rama");
        stud.add("salu");
        stud.add("tillu");
        stud.add("millu");
        Collections.sort(stud);
        System.out.println("sorted in ascending order: "+ stud);
        //Collections.sort(stud,Collections.reverseOrder());
        Collections.sort(stud, Comparator.reverseOrder());
        System.out.println("sorted in reversed order: " + stud);


        System.out.println(stud);

        System.out.println(stud.contains("millu"));
        System.out.println(stud.isEmpty());

        stud.addFirst("Sai");
        stud.addLast("Ram");
        System.out.println(stud.subList(3,stud.size()));
        System.out.println(stud.indexOf("tillu"));
        System.out.println(stud.getFirst());
        System.out.println(stud.getLast());
        System.out.println(stud);
        System.out.println(stud.get(5));
    }
}
