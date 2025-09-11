package ua.com.kisit.unit2;

/*
v.1
author: Lozovik
name: project #1
 */


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Second {

    // psvm + Tab
    public static void main(String[] args) {

        byte b = 1;
        System.out.println(b);

        short s = 1;
        System.out.println(s);

        int i = 1;
        System.out.println(i);

        long l = 10000000L;
        System.out.println(l);

        float f = 1.1f;
        System.out.println(f);

        double d = 1.123;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);
        char c1 = 'b';
        System.out.println(c1);

        boolean logic = true;
        System.out.println(logic);

        String str = "Hello World";
        System.out.println(str);

//     Byte
//     Integer
//     Long
//     Character
//     Double
//     Float

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        int[] array2 = {4, 5, 6, 7,};

        // For
        // int j = j+1;
        // j++;

        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

        int j = 0;
        for (; j < array.length; ) {
            System.out.println(array[j]);
            j++;
        }

//        j = 0;
//        // Вічне
//        for (; ; ) {
//            System.out.println(j);
//            j++;
//        }

        // While
        j = 0;
        while (j < array.length) {
            System.out.println(array[j]);
            j++;
        }

        // do-while
        j = 0;
        do {
            System.out.println(array[j]);
            j++;
        } while (j < array.length);


        // v.7
        for (int el : array) {
            System.out.println(el);
        }

        // stream
        Arrays
                .stream(array)
                .forEach(x -> System.out.println(x));

        System.out.println(Arrays.toString(array));

        int[][] array3 = new int[3][4];

        int[][] array4 = {
                {1, 2, 3, 4},
                {5, 6, 6, 7},
                {8, 9, 10, 11},
        };

        for (int k = 0; k < array4.length; k++) {
            for (int m = 0; m < array4[k].length; m++) {
                System.out.print(array4[k][m] + ", ");
            }
            System.out.println();
        }


        for (int k = 0; k < array4.length; k++) System.out.println(Arrays.toString(array4[k]));

        String str1 = "Hello";
        System.out.println(str1.hashCode());
        str1 = "Hello" + " World!";
        System.out.println(str1.hashCode());
        String str2 = "Hello World!";
        System.out.println(str2.hashCode());


        logic = true;

        if (logic) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        logic = (logic == true) ?  true : false;
        System.out.println(logic);

        String operation = "+";

        switch (operation) {
            case "+":
                System.out.println(operation + "+");
                break;
            case "-":
                System.out.println(operation + "-");
                break;
            default:
                System.out.println(operation + "Any");
        }

        for (int k = 0; k < 10; k++) {
            if(k > 3) break;
            System.out.println(k);
        }

        for (int k = 0; k < 10; k++) {
            if(k < 2) continue;
            System.out.println(k);
        }


    }
}
