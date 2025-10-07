package ua.com.kisit.unit4;

import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        Object[] arr3 = {1, 2, 3.22, 'd', "string"};

        int[] arr4 = new  int[5];
        arr4[0] = 1;
        arr4[1] = 2;
        arr4[2] = 3;
        arr4[3] = 4;
        arr4[4] = 5;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

//        System.out.println(arr4[5]);

        int[][] arr5 = new  int[3][3];

        arr5[0][0] = 1;
        arr5[0][1] = 2;
        arr5[0][2] = 3;

        arr5[1][0] = 4;
        arr5[1][1] = 4;
        arr5[1][2] = 4;

        arr5[2][0] = 4;
        arr5[2][1] = 4;
        arr5[2][2] = 4;

        for (int i = 0; i < arr5.length; i++) {
            System.out.println(Arrays.toString(arr5[i]));
        }

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + ", ");
            }
            System.out.println();
        }
    }

}
