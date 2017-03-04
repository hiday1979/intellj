package edu.tomerbu;

/**
 * Created by hackeru on 26/01/2017.
 */
public class MyMath {
    static int add(int x, int y) {
        return x + y;
    }


    static int factorial(int n) {
        if (n == 0)
            return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
