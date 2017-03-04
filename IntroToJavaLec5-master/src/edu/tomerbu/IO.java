package edu.tomerbu;

import java.util.Scanner;

/**
 * Created by hackeru on 26/01/2017.
 */
public class IO {

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println();
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    //get int
    static int getInt(String prompt) {
        print(prompt);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    static String getString() {
        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

}
