public class Main {
    public static void main(String[] args) {

        /* Пример статического и динамического связывания в Java */
        Insurance current = new CarInsurance();

        /* Динамическое связывание на основе объекта */
        int premium = current.premium(); /* public int premium()*/

        /* Статическое = раннее связывание на основе класса, */
        /* происходит во время компиляции, то есть код «знает», какой метод вызывать после компиляции исходного кода на Java в файлы классов*/
        String category = current.category(); /* public static String category() */

        System.out.println("premium : " + premium);
        System.out.println("category : " + category);
    }
}

class Insurance{
    public static final int LOW = 100;

    public int premium(){
        return LOW;
    }

    public static String category(){
        return "Insurance";
    }

}

class CarInsurance extends Insurance{
    public static final int HIGH = 200;

    public int premium(){
        return HIGH;
    }

    public static String category(){
        return "Car Insurance";
    }

}
   /* Результаты выполнения:

        premium : 200
        category : Insurance */
