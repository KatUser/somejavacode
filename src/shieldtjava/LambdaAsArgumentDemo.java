package shieldtjava;

public class LambdaAsArgumentDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Test string for lambda expression";
        String outStr  = stringOp((str) -> str.toUpperCase(), inStr);
        boolean outStr2 = Boolean.parseBoolean(stringOp((str) -> String.valueOf(str.contains("y")), inStr));
        System.out.println(outStr);
        System.out.println(outStr2);
    }
}
