package al.readingfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator
                + "Users" + separator
                + "Pasku" + separator
                + "Desktop" + separator
                + "Test.txt";
        File file = new File(path);
        Scanner scanner  = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int[] nums = new int[3];
        int counter = 0;
        for (String n : numbers) {
            nums[counter] = Integer.parseInt(n);
            counter++;
        }
        scanner.close();
        System.out.println(Arrays.toString(nums));
    }
}