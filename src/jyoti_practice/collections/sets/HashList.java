package jyoti_practice.collections.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashList {
    public static void main(String[] args) {
        HashSet<String> list1 = new HashSet<>();
        list1.add("Sai");
        list1.add("Ram");
        list1.add("Jyoti");
        list1.add("Vyajanti");//insertion order is not maintained
        list1.add("Sheela");
        list1.add(null);//Single null is inserted
        list1.add(null);
        System.out.println(list1);
        System.out.println(list1.size());
        Iterator<String> it3 = list1.iterator();
        while (it3.hasNext()){
            System.out.println(it3.next());
        }
    }
}
