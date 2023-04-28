package collectionsjava;

import java.util.ArrayList;
import java.util.List;

public class ArrListMethods6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);
        List<String> myList = arrayList1.subList(1, 4); /* Не включая последний парамаетр*/
        System.out.println("myList = " + myList);
        myList.add("Fedor");
        System.out.println("myList = " + myList);
        System.out.println("ArrayList = " + arrayList1); /* myList = view, представление */
        arrayList1.add("Sveta");
        System.out.println("ArrayList = " + arrayList1);
        /* System.out.println("myList = " + myList); ConcurrentModificationException надо через view */
    }
}
