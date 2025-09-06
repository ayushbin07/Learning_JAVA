package SEP_06;

//Wrapper
//classes
//Allow primitive values (int char, double, boolean)
//to be used as objects. "Wrap them in an object"
//Generally, don't wrap primitives unless you need an object.
//Allows use of Collections Framework and static Utility Methods.

import java.nio.charset.CharsetEncoder;

public class Wrapper {
    public static void main(String[] args) {
        //Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = 'S';
        Boolean d = true;

        //Unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean boo = d;

        //Convert
        String f = Integer.toString(a);
        String g =  Double.toString(b);
        String h = Character.toString(c);
        String i = Boolean.toString(d);

        //Concatation
        String s = f+g+h+i;
        System.out.println(s);

        //To convert wrapper into its primitive data type, different parse method can be used.
        //Inside bracket it should be String. char is the exeption.
        int abc = Integer.parseInt("123");
        double def = Double.parseDouble("3.14");
        char ghi = "Pizza".charAt(2);
        boolean jkl = Boolean.parseBoolean("true");
        //Wrapper classes has different utility methods
        //like
        System.out.println(Character.isAlphabetic(c));
        System.out.println(Character.isUpperCase(c));
        System.out.println(Character.isLetter(c));
    }
}
