package jyoti_practice.testing_packages;

import jyoti_practice.defaultclass.DefaultAccessibilty;
import jyoti_practice.privateclass.Privateclass;
import jyoti_practice.protectedclass.ProtectedClass;
import jyoti_practice.publicclass.PublicClass;

public class Main extends ProtectedClass{
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.accessiblity();
        publicClass.Name = "jyoti";
        System.out.println(publicClass.Name);

        ProtectedClass protectedClass = new ProtectedClass();
        DefaultAccessibilty default1 = new DefaultAccessibilty();
        Privateclass pbr1 = new Privateclass();



    }
}
