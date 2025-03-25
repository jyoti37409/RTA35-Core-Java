package jyoti_practice.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Cherries");
        fruits.add("Lemons");
        fruits.add("Oranges");
        fruits.add("Mangoes");
        System.out.println(fruits);
        fruits.remove("Lemons");
        fruits.addFirst("Coconut");
        fruits.addLast("Oranges");
        //System.out.println(fruits.get(0));
        Collections.sort(fruits);
        System.out.println(fruits);
        System.out.println(fruits.get(3));

    }
}
