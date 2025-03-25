package jyoti_practice;

public abstract class Abstract_implementation {
     String carname;

    abstract void start();
    abstract void stop();
    void play(int i, int i1){
        System.out.println("I can play"

        );
    }
}
class Imp_abs extends Abstract_implementation{

    @Override
    void start() {
        System.out.println("I can start from here");
    }

    @Override
    void stop() {
        System.out.println("I can stop from here");

    }


    void play(int a, int b) {
        System.out.println(a+b);

    }
}
class MainT{
    public static void main(String[] args) {
        Abstract_implementation obje5 = new Imp_abs();
        obje5.play(5,6);
        obje5.stop();
        obje5.start();
        System.out.println(obje5.carname="Honda");


    }
}
