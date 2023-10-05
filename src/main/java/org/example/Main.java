package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {12.0, 930.0, -128.2, 33.4, -22.8, 776.23, -12.44, -533.0,
                1123.455, 1.44, 0.123, -34.33, -0.17, 55.5, 15.0};
        int count = 0;
        double sum = 0.0;
        boolean start = false;
        for (double d : array) {
            if (d < 0.0 && !start) {
                start = !start;
            }
            if (start && d > 0) {
                sum += d;
                count++;
            }
        }
        System.out.println(sum / count);

        // ----------------------------------------------------- //

        for (int i = 0; i < array.length; i++) {
            double d = array[i];
            System.out.println(Arrays.toString(array));
            for (int j = i; j < array.length; j++) {
                if (d > array[j]) {
                    d = array[j];
                    array[j] = array[i];
                    array[i] = d;
                }
            }
        }
    }

}