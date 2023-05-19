package cft;

import java.lang.Math;
import java.util.Scanner;

public class Computer {
    private boolean isOn;
    private boolean hasProcessor;
    private boolean hasRAM;
    private boolean hasSSD;
    private int cycles;

    public Computer(boolean isOn, boolean hasProcessor, boolean hasRAM, boolean hasSSD, int cycles) {
        this.isOn = isOn;
        this.hasProcessor = hasProcessor;
        this.hasRAM = hasRAM;
        this.hasSSD = hasSSD;
        this.cycles = cycles;
    }

    public void turnOnMethod() {
        if (isOn && hasProcessor && hasRAM && hasSSD && cycles != 0) {
            for (int i = 0; i < cycles; i++) {
                int randmonNumber = (int) (Math.random() * 2);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Включение - Введите 0 или 1 :");
                int x = Integer.parseInt(scanner.nextLine());
                if (x != randmonNumber) {
                    System.out.println("Ваш комп помер.");
                    cycles -= cycles;
                } else {
                    System.out.println("Комп вкл.");
                    cycles--;
                }
            }
        } else {
            System.out.println("Включение - Укажите все параметры компа.");
        }
    }

    public void turnOffMethod() {
        if (isOn && hasProcessor && hasRAM && hasSSD && cycles != 0) {
            for (int i = 0; i < cycles; i++) {
                int randmonNumber = (int) (Math.random() * 2);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Выключение - Введите 0 или 1 :");
                int x = Integer.parseInt(scanner.nextLine());
                if (x != randmonNumber) {
                    System.out.println("Ваш комп помер.");
                    cycles -= cycles;
                } else {
                    System.out.println("Комп выкл.");
                    cycles--;
                }
            }
        } else {
            System.out.println("Выключение - укажите все параметры компа.");
        }
    }


    public void printAllComputerFields() {
        String[] allComputerFields = {
                "Есть процессор : " + hasProcessor,
                "Есть оперативка : " + hasRAM,
                "Есть жесткий диск : " + hasSSD,
                "Количество циклов : " + cycles};
        for (String field : allComputerFields) {
            System.out.println(field);
        }
    }
}

class RunComputer {
    public static void main(String[] args) {
        Computer computer = new Computer(true, true, true, true, 18);
        computer.printAllComputerFields();

        computer.turnOnMethod();
        computer.turnOffMethod();
    }

}
