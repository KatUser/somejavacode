package al.serializing;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -2234352794708504014L;
    @Serial
    //private static final long serialVersionUID = -7939302781279930191L;
    private int id;
    private String personName;

    

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }

    @Override
    public String toString() {
        return id + " : " + personName;
    }
}
