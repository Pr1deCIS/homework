package hw_procedural.hw3_arrays;

import java.util.Arrays;

public class Hw1 {


    public static void main(String[] args) {
        String[] a = {"Это","что-то","вроде","бегущей","строки"};

        moveToRight(a, 5);
        System.out.println(Arrays.toString(a));
    }

    public static void moveToRight(String[] a, int pos) {
        int size = a.length;

        for (int i = 0; i < pos; i++) {
            String temp = a[size - 1];

            for (int b = size - 1; b > 0; b--) {
                a[b] = a[b - 1];
            }

            a[0] = temp;

        }
    }
}
