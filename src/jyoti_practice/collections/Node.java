package jyoti_practice.collections;

public class Node <T>{
    T data;//T generic hold all types of data
    Node<T> next;

    public  Node(T data){
        this.data = data;
        this.next = null;
    }


}
