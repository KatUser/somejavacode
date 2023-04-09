package al.exc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Run after reading file");
        } catch (FileNotFoundException e) { /*можем добавить свою обработку искл*/
            /* e.printStackTrace(); */
            System.out.println("File not found");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Run after try-catch-finally");
    }

    public void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }
}
