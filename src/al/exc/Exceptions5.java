package al.exc;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if(x != 0) {
                try {
                    throw new IOException();
                } catch (IOException ioe) {
                    System.out.println("The user didn't enter zero.");
                }

            }
        }
    }
}