package collectionsjava;

import java.util.ArrayList;
import java.util.Objects;

public class ArListMethods7 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);
        Object [] array = arrayList1.toArray();
        String [] strArray = arrayList1.toArray(new String[0]);
        for (String name : strArray) {
            System.out.println(name);
        }
    }
}
