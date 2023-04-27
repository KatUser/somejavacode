package collectionsjava;

import java.util.ArrayList;

public class ArrListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1, "Misha");
        for (String name : arrayList1) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println(arrayList1.get(0));
        System.out.println();
        arrayList1.set(1, "Masha"); /* = replace */
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}
