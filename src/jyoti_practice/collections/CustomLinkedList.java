package jyoti_practice.collections;

public class CustomLinkedList {
    private  Node<Integer> head;

    public  CustomLinkedList(){
        this.head = null;

    }
    public  void add(int data){

        Node<Integer> newNode = new Node<>(data);
        if(head==null){
            this.head = newNode;
        }
        else{
            Node<Integer> currentHead = head;
            while (currentHead.next!=null){
                currentHead= currentHead.next;
            }
            currentHead.next=newNode;
        }

    }
    public void printlist(){
        Node<Integer> currentHead = head;
        if(currentHead==null){
            System.out.println("List is empty");
            return;
        }
        while (currentHead!=null){
            System.out.println(currentHead.data + "-->");
            currentHead = currentHead.next;
        }
        System.out.println("null");
    }
}
class customExcutor{
    public static void main(String[] args) {
        CustomLinkedList obj = new CustomLinkedList();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.printlist();
    }
}
