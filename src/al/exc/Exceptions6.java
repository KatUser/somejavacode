package al.exc;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions6 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if(x != 0) {
                throw new ScannerException("The user didn't type zero.");
                }

            }
        }
    }
