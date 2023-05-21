package zt;

public class Human {
    String name;
    Car3 car;
    BankAccount3 bankAccount;

    void info() {
        System.out.println("Name : " + name + ", Car color : " + car.color
            + ", Balance : " + bankAccount.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Tom";
        human.car = new Car3("red", "V12");
        human.bankAccount = new BankAccount3(1, 100.0);
        human.info();

        BankAccount3 bankAccount3 = new BankAccount3(2, 1000);
        System.out.println(bankAccount3.addMoney(1000));
        System.out.println(bankAccount3.takeMoney(1000));
    }
}

class Car3 {
    String color;
    String engine;

    Car3(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}

class BankAccount3 {
    int id;
    double balance;
    BankAccount3 (int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    double addMoney(double sum) {
        return this.balance += sum;
    }

    double takeMoney(double sum) {
        return this.balance -= sum;
    }
}
