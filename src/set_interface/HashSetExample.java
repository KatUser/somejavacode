package set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        /* set.add(null); ok */
        set.remove("Zaur");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        /* set.clear();
        System.out.println(set.isEmpty()); */
        System.out.println(set.contains("Vasya"));
    }
}
