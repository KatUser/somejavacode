package al.exc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/");
        Scanner scanner = new Scanner(file);
    }
}
