package zt;

public class BankAccount2 {
    int id = 10; /* instance variables */
    String name = "Petr";
    double balance = 100.0;
}

class BankAccount2Test {
    public static void main(String[] args) {
        BankAccount2 bankAccount2 = new BankAccount2();
        bankAccount2.name = "test";
        BankAccount2 bankAccount21 = bankAccount2;
        System.out.println(bankAccount21.name); /* same reference */
        System.out.println(bankAccount21.equals(bankAccount2));
    }
}