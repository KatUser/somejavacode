package al.serializing;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream
                     = new ObjectInputStream(new FileInputStream("people.bin"))){

            Person[] people = (Person[]) objectInputStream.readObject();
            System.out.println(Arrays.toString(people));
//            Person person1 = (Person) objectInputStream.readObject();
//            Person person2 = (Person) objectInputStream.readObject();

//            System.out.println(person1);
//            System.out.println(person2);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
