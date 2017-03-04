package edu.tomerbu;

import java.util.Scanner;

/**
 * Created by hackeru on 26/01/2017.
 */
public class Older {
    void juggedArray(){
        //jugged array
        int[][] arr = new int[3][];
        int[] row1 = {0, 1, 2, 3, 4, 5, 6};
        int[] row2 = {2, 3, 4, 5, 6};
        int[] row3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        arr[0] = row1;
        arr[1] = row2;
        arr[2] = row3;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }


    void arrays(){
            /*
        int[][] table = {{1, 2, 3, 4, 5},
                        {2, 4, 6, 8, 10},
                        {20, 10, 5, 3, 2},
                        {3, 6, 9, 12, 15}};

        */

        int[][] arr = new int[5][5];
        //how many arrays? arr.length

        for (int i = 0, j = 20; i < arr[0].length; i++, j = j / 2 + j % 2) {
            //{1, 2, 3, 4, 5}
            arr[0][i] = i + 1;
            //{2, 4, 6, 8, 10}
            arr[1][i] = (i + 1) * 2;
            //{20, 10, 5, 3, 2}
            arr[2][i] = j;
            // {3, 6, 9, 12, 15}
            arr[3][i] = (i + 1) * 3;
        }

        for (int i = 0; i < arr[0].length; i++) {
            arr[i][i] = (i + 1) * (i + 1);
            //5, 10, 20, 40, 80
        }


        int k = 5;
        for (int i = 0, j = arr[0].length - 1; i < arr[0].length; i++, j--) {
            arr[i][j] = k;
            k = k * 2;
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }






}
