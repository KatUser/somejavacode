package al.serializing;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Vasya");
        Person person2 = new Person(2, "Rimma");
        Person[] people = {new Person(1, "Vasya"),
                new Person(2, "Rimma"),
                new Person(3, "Tom")};

        try (ObjectOutputStream objectOutputStream
                     = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            objectOutputStream.writeObject(people);
//            objectOutputStream.writeObject(person1);
//            objectOutputStream.writeObject(person2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
