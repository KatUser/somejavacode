package zt;

public class BankAccount {
    int id; /* instance variables */
    String name;
    double balance;
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        BankAccount hisBA = new BankAccount();
        myBankAccount.id = 1;
        myBankAccount.name = "MyAccount";
        myBankAccount.balance = 12.35;

        System.out.println(myBankAccount.id);
        System.out.println(hisBA.id + " " + hisBA.balance + " " + hisBA.name);
    }
}