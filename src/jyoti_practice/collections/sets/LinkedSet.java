package jyoti_practice.collections.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> list2 = new LinkedHashSet<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(25);
        list2.add(70);//inseration order is maintained
        list2.add(null);//single null value is inserted
        list2.add(null);
        System.out.println(list2);
        System.out.println(list2.size());
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
