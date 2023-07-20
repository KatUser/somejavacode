package al;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteIntoFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("al/testFile");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Test row 1");
        pw.println("Test row 2");

        pw.close();
    }
}
