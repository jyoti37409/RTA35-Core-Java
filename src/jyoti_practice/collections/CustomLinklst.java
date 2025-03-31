package jyoti_practice.collections;

public class CustomLinklst {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private  Node head;

    public void add(int data){
        Node newNode  = new Node(data);
        if(head==null){
            head=newNode;
            //return;

        }
        else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
                //return;
            }
            temp.next = newNode;
        }
    }
    public void printlst(){
        if(head== null){
            System.out.println("list is Empty");
            return;

        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        CustomLinklst customLinklst = new CustomLinklst();
        customLinklst.add(10);
        customLinklst.add(20);
        customLinklst.add(30);
        customLinklst.add(40);
        customLinklst.add(50);
        customLinklst.add(60);
        customLinklst.printlst();
    }

}







