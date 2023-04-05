package al.access_modifiers;

public class Test2 {
    public static void main(String[] args) {
        float f = 123.3F;
        int a = 123;
        long l = a; /* неявное привидение*/
        int x = (int) l; /*явное привидение типов*/

        float fl = (float) 456.09;

        int b = 123;
        double y = b;

        double z = 123.7;
        int c = (int) z;
        System.out.println(c);
        System.out.println(Math.round(z));

        byte by =  (byte) 128; /*-128 - 127*/
        System.out.println(by);
    }
}
