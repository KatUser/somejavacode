package set_interface;

import java.util.*;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("Jesse");
        names.add("Mike");
        names.add("Saul");
        names.add("Walter");
        names.remove("Walter");

        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(System.out::println);
        Iterator<String> namesIterated = names.iterator();
        while (namesIterated.hasNext()) {
            System.out.println(namesIterated.next() + " iterated");
        }
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Helen"));
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println("Removed all elements in names");
        System.out.println(names.isEmpty());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        System.out.println(numbers);

        Set<Integer> numbersSet = new HashSet<>(numbers);
        System.out.println(numbersSet);

        Set<String> exampleTreeSet = new TreeSet<>();
        exampleTreeSet.add("Walter");
        exampleTreeSet.add("Jesse");
        exampleTreeSet.add("Mike");
        exampleTreeSet.add("Saul");
        exampleTreeSet.add("Ann");
        System.out.println(exampleTreeSet);

        Set<String> exampleLinkedHashSet = new LinkedHashSet<>();
        exampleLinkedHashSet.add("Walter");
        exampleLinkedHashSet.add("Ann");
        exampleLinkedHashSet.add("Jesse");
        exampleLinkedHashSet.add("Mike");
        exampleLinkedHashSet.add("Saul");
        exampleLinkedHashSet.forEach(System.out::println);

    }
}
