package jyoti_practice;

public interface ClassA {
    void run();
}
interface  ClassC{
    void fly();
}

class ClassB implements ClassA,ClassC{

    @Override
    public void run() {
        System.out.println("I can run");
    }

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.run();
        obj.fly();

    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
