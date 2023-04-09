package al.exc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            /* e.printStackTrace(); */
            System.out.println("Exception thrown in main-method");
        }

    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }
}
