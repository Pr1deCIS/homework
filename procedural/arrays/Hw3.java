package hw_procedural.hw3_arrays;

import java.util.Arrays;

public class Hw3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7};
        int[] arrayResult = new int[array1.length + array2.length];
        int currentPosition = 0;

        for( int i = 0; i < array1.length; i++) {
            arrayResult[currentPosition] = array1[i];
            currentPosition++;
        }

        for( int j = 0; j < array2.length; j++) {
            arrayResult[currentPosition] = array2[j];
            currentPosition++;
        }
        System.out.println(Arrays.toString(arrayResult));
    }
}
