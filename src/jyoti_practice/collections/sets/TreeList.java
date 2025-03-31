package jyoti_practice.collections.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeList {
    public static void main(String[] args) {
        TreeSet<Character> list3 = new TreeSet<>();
        list3.add('A');
        list3.add('B');
        list3.add('C');
        list3.add('D');
        list3.add('E');//insertion order is maintained
        //list3.add(null);//null is not allowed it gives null pointer exception
        //list3.add(null);
        System.out.println(list3.ceiling('A'));
        Iterator<Character> it1 = list3.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
