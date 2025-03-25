package jyoti_practice.protectedclass;

public class Subclass  {
    public static void main(String[] args) {
        ProtectedClass pro = new ProtectedClass();
        pro.protectedAccessibilty();
        pro.name = "Havisha";
        System.out.println(pro.name);

    }
}
