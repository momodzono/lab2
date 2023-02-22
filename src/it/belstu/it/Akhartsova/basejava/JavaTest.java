package it.belstu.it.Akhartsova.basejava;
import javax.rmi.ssl.SslRMIClientSocketFactory;

import static java.lang.Math.*;
import java.util.Arrays;

/**
 * @author Yancha
 * @version 1.0
 */
public class JavaTest {
    static int sint;
    //c
    final int f = 2;
    public final int f2 = 2;
    public static final int f3 = 2;
    /**
     * Точка входа в программу
     * @param args аргументы командной строки
     * @return void
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {
        //a
        boolean bool = true;
        byte b = 50;
        int i = 5;
        short s = 32767;
        long l = 922337456;
        double d = 5.0855676567;
        char ch = 'a';
        String str = "Hello!";

        System.out.println(str + i);
        System.out.println(str + ch);
        System.out.println(str + d);

        b = (byte)(b + i);
        i = (int)(d + i);
        l = (long)(i + Integer.MAX_VALUE);

        System.out.println(sint);

        boolean r1 =true && false;
        boolean r2 = true ^ false;

        //System.out.println(true + true); выполнение невозможно\

        var v1 = 9223372036854775807l;
        var v2 = 0x7fff_ffff_fffl;

        char ch1 = 'a';
        char ch2 = '\u0061';
        char ch3 = 97;
        System.out.println(ch1 + ch2 + ch3);

        System.out.println("3.45 % 2.4 = " + 3.45 % 2.4 );
        System.out.println("1.0 / 0.0 = " + 1.0 / 0.0 );
        System.out.println("0.0 / 0.0 = " + 0.0 / 0.0 );
        System.out.println("log(-345) = " + Math.log(-345));
        System.out.println("Float.intBitsToFloat(0x7F800000) = " + Float.intBitsToFloat(0x7F800000));
        System.out.println("Float.intBitsToFloat(0xFF800000) = " + Float.intBitsToFloat(0xFF800000));

        //d
        System.out.println("PI = " + PI);
        System.out.println("E = " + E);
        System.out.println("round(PI) = " + round(PI));
        System.out.println("round(PI) = " + round(PI));
        System.out.println("min(PI, E) = " + min(PI, E));
        System.out.println("Случайное число [0; 1] = " + random());

        //e
        Boolean bool1 = true;
        Character c1 = 'a';
        Integer i1 = 5;
        Long l1 = 10000L;
        Short s1 = 10;
        Byte b1 = 20;
        Double d1 = 2.5;

        l1 += (i1 & 12) - (s1 >> 2);
        System.out.println("l1 = " + l1);

        System.out.println("MIN_LONG = " + Long.MIN_VALUE);
        System.out.println("MAX_LONG = " + Long.MAX_VALUE);
        System.out.println("MIN_DOUBLE = " + Double.MIN_VALUE);
        System.out.println("MAX_DOUBLE = " + Double.MAX_VALUE);

        int int1 = 9;
        Integer int2 = int1;
        int1 = int2;

        byte byte1 = 123;
        Byte byte2 = byte1;
        byte1 = byte2;

        String text1 = "51";
        int1 = Integer.parseInt(text1);
        System.out.println("int1 = " + int1);
        System.out.println("Integer.toHexString(255) = " + Integer.toHexString(12));
        System.out.println("Integer.compare(1, 2) = " + Integer.compare(9, 2));
        System.out.println("Integer.toString(255) = " + Integer.toString(12));
        System.out.println("Integer.bitCount(255) = " + Integer.bitCount(255));
        System.out.println("Double.isNaN(0.0 / 0.0) = " + Double.isNaN(0.0 / 0.0));

        //f
        String s34 = "2345";

        var i341 = 76;
        int i342 = Integer.parseInt(s34);
        int i343 = Integer.valueOf(s34);

        System.out.println("i341 = " + i341);
        System.out.println("i342 = " + i342);
        System.out.println("i343 = " + i343);

        byte[] bytes = s34.getBytes();
        String s34by = new String(bytes);
        System.out.println("s34_b = " + s34by);

        String st = "true";
        boolean b3 = Boolean.parseBoolean(st);
        System.out.println("b3 = " + b3);

       // boolean b4 = new Boolean("true");

        String str1 = "Hello";
        String str2 = "Hello"; // NULL

        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));

        String str3 = "Hello, world!";
        String[] str3_split = str3.split(" ");
        System.out.println("str3_split = " + Arrays.toString(str3_split));
        System.out.println("str3.contains(\"world\") = " + str3.contains("world"));
        System.out.println("str3.hashCode() = " + str3.hashCode());
        System.out.println("str3.indexOf(\"world\") = " + str3.indexOf("world"));
        System.out.println("str3.length() = " + str3.length());
        System.out.println("str3.replace(\"world\", \"java\") = " + str3.replace("world", "java"));

        char [][] c4;
        char [] c2 [];
        char c3 [] [];

        c4 = new char[3][];
        System.out.println("c4.length() = " + c4.length);
        for (int j = 0; j < c4.length; j++) {
            c4[j] = new char[j + 1];
            System.out.println("c4[" + j + "].length() = " + c4[j].length);
        }
        c2 = new char[3][];
        c3 = new char[3][];

        boolean res = c2 == c3;
        System.out.println("res = " + res);
        c2 = c3;
        res = c2 == c3;
        System.out.println("res = " + res);

        for (var arr : c4) {
            for (var el : arr) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        WrapperString ws = new WrapperString("Begin");
        ws.replace('e', 'a');
        System.out.println(ws.getName());

        WrapperString ws2 = new WrapperString("Begin") {
            public void replace(char oldchar, char newchar) {
                super.replace(oldchar, newchar); //super - basic class
            }

            public void delete(char newchar) {
                super.replace(newchar, ' ');
            }
        };


    }
}
