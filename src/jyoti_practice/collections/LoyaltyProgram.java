package jyoti_practice.collections;

import java.util.HashSet;

public class LoyaltyProgram {
    public static void main(String[] args) {
        HashSet<String> membersIDs = new HashSet<>();
        membersIDs.add("Member1");
        membersIDs.add("Member2");
        membersIDs.add("Member3");
        membersIDs.add("Member4");
        membersIDs.add("Member5");

        eligiblity(membersIDs,"Member1");
        eligiblity(membersIDs,"Member9");


    }
    private  static  void  eligiblity(HashSet<String> membersIDs,String customerID){
        if(membersIDs.contains(customerID)){
            System.out.println(customerID +" Eligiable for the discount");
        }
        else{
            System.out.println(customerID+ " Not Eligible for the discount");
        }
    }
}
