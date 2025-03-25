package jyoti_practice.collections;
import java.util.Collections;
import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String>fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherries");
        fruits.add("Graphes");
        fruits.add("Apple");
        fruits.add("Jamun");
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(Collections.reverseOrder());
        System.out.println(fruits.isEmpty());

    }
}
