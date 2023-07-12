package stepikLessons;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        box box1 = new box();
//        box1.setDimension(1, 1, 1);
//        double volume = box1.height * box1.length * box1.width;
//        System.out.println(volume);
//
//        Human human1 = new Human();
//        Human human2 = new Human();
//        Human human3 = new Human();
//        human1.name = "Stepa";
//        human2.name = "Vasya";
//        human3.name = "Lena";
//        human1.age = 47;
//        human2.age = 25;
//        human3.age = 34;
//        human1.weight = 60.0;
//        human2.weight = 54.0;
//        human3.weight = 71.5;
//        System.out.println(box1.getVolume());
//
//        Dog dog1 = new Dog();
//        dog1.name = "Tuzik";
//        dog1.breed = "Corgi";
//        dog1.weight = 13.54;
//        dog1.speed = 5;
//        System.out.println(dog1.getInfo());
//        box1.printVolume();
//        dog1.run();
//        Test test = new Test();
//        System.out.println(test.square(20));
//        Math math = new Math();
//        System.out.println(MyMath.multiply(10, 5));
//        System.out.println(MyMath.multiply(9.7, 11.4));
//        System.out.println(MyMath.multiply(4));
//        Monster monster1 = new Monster();
//        System.out.println(monster1.eye
//                + " " + monster1.hand
//                + " " + monster1.leg);
//        Monster monster2 = new Monster(3);
//        System.out.println(monster2.eye
//                + " " + monster2.hand
//                + " " + monster2.leg);
//        Monster monster3 = new Monster(0, 5, 8);
//        System.out.println(monster3.eye
//                + " " + monster3.hand
//                + " " + monster3.leg);

//        box current = new box(10);
//        box another = new box(20);
//        current.compareBoxes(another);
//
//        box newBox = new box(current);
//        newBox.printVolume();
//        current.setDimension(20, 20, 20);
//        current.copy().printVolume();
//        current.increase().printVolume();
//        MyArrayList employees = getEmployees();
//        employees.add("James");
//        for (int i = 0; i < employees.getSize(); i++) {
//            System.out.println(employees.getElement(i));
//        }
//
//        employees.remove("Emma");
//        for (int i = 0; i < employees.getSize(); i++) {
//            System.out.println(employees.getElement(i));
//        }
//    }
//
//    private static MyArrayList getEmployees() {
//        MyArrayList employees = new MyArrayList();
//        employees.add("Irina");
//        employees.add("Max");
//        employees.add("Tom");
//        employees.add("Emma");
//        employees.add("Nick");
//        return employees;
//        String s = "1000";
//        String s1 = "2000";
//        System.out.println(s + s1);
//        int a = Integer.parseInt(s);
//        int b = Integer.parseInt(s1);
//        System.out.println(a + b);

//        String s = "This is John. He is 27 years old.";
//        String name = s.substring(8, 12);
//        int age = Integer.parseInt(s.substring(20, 22));
//        System.out.println(name);
//        System.out.println(age);
//        Human h1 = new Human(name, age);
//        ArrayList<String> employees = getEmployees();
//        employees.add("Tomas");
//        employees.remove("Max");
//        employees.remove(0);
//        System.out.println(employees.get(0));
//        employees.forEach(System.out::println);
//
//        List<Integer> myNumbers = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            myNumbers.add(i);
//        }
//        myNumbers.forEach(System.out::println);

        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Artem");
        names.add("Alisa");
        names.add("Alex");
        names.add("Alla");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<String> finalList = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++) {
            finalList.add(numbers.get(i) + " - " + names.get(i));
        }
        finalList.forEach(System.out::println);

        HashSet<String> str = getEmployees2();
        str.forEach(System.out::println);
    }
        private static ArrayList<String> getEmployees () {
            ArrayList<String> employees = new ArrayList<>();
            employees.add("Irina");
            employees.add("Max");
            employees.add("Tom");
            employees.add("Emma");
            employees.add("Nick");
            return employees;
        }

        private  static HashSet<String> getEmployees2() {
            HashSet<String> employees = new HashSet<>();
            employees.add("Irina");
            employees.add("Max");
            employees.add("Tom");
            employees.add("Emma");
            employees.add("Nick");
            return employees;
        }
    }

