package jyoti_practice.collections;

public class LL {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Define head for the linked list

    // Add node at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode; // Fix the linking issue
    }
    //deletefirst
    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;

    }
    //deletelast
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondlast = head;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next= null;

    }

    // Print linked list
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) { // Fix loop condition
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL linkedlist = new LL();
        linkedlist.addFirst("a");
        linkedlist.addFirst("is");
        linkedlist.addLast("list");
        linkedlist.addFirst("this");
        linkedlist.printList();
        linkedlist.deletefirst();
        linkedlist.printList();
        linkedlist.deletelast();
        linkedlist.printList();
    }
}
