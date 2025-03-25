package jyoti_practice;

class StaticBlock {
    static {
        System.out.println("Initializing Payment Gateway... Loading API Keys...");
    }

    public static void processPayment(String payer, double amount) {
        System.out.println(" Processing payment of $ " + amount + " for " + payer);
    }

}

public class Static_Imp {
    public static void main(String[] args) {
        StaticBlock.processPayment("Alex", 100);
        StaticBlock.processPayment("Bob", 120.50);
    }
}