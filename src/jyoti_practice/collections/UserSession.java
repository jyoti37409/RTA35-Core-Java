package jyoti_practice.collections;

import java.util.ArrayList;

public class UserSession {
    private ArrayList<String> activeUser = new ArrayList<>();

    public void userLogged(String name){
        activeUser.add(name);
        System.out.println("user logged in :"+ name);
    }
    public void  userLoggedOut(String name){
        System.out.println("user logged out: " +activeUser.remove(name));
    }
    public boolean isActiverUSer(String name){
        return activeUser.contains(name);
    }
    public  void printActiveUser(){
        System.out.println(activeUser);
    }

    public static void main(String[] args) {
        UserSession userhistory = new UserSession();
        userhistory.userLogged("Sai");
        userhistory.userLogged("Ram");
        userhistory.userLogged("Rama");
        userhistory.userLogged("Roopa");
        userhistory.userLogged("Sarita");
        userhistory.userLoggedOut("Rama");
        userhistory.isActiverUSer("Rama");
        userhistory.printActiveUser();
        System.out.println("Sarita is active member: " + userhistory.isActiverUSer("Sarita"));

    }

}
