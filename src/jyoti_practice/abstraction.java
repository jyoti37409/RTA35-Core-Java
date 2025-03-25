package jyoti_practice;

public  abstract class abstraction {
    void code(){
        System.out.println("I can code the java");
    }
    abstract void coding();


}

class AbstractA extends abstraction implements ClassA,ClassC{

    @Override
    void coding() {
        System.out.println("I can code python");
    }

    public static void main(String[] args) {
        abstraction obja = new AbstractA();
        ClassA obja2 = new AbstractA();
        //ClassB obja3 = new AbstractA();
        obja.code();
        obja.coding();
        //obja3.fly();
        obja2.run();
    }

    @Override
    public void run() {
        System.out.println("I am from abstraction class");

    }

    @Override
    public void fly() {

        System.out.println("I am running the method from abstact class");

    }
}

