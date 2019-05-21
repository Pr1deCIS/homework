package hw_procedural.hw3_arrays;

import java.util.Arrays;

public class Hw2 {
    public static void main(String[] args) {
        int[] numbers = {62, 82, 32, 5, 5, 14, 52, 82, 58, 71, 13, 15, 6, 7, 8, 9, 34, 2};
        int lng = numbers.length-1;
        int v = 1;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < lng; i++) {
            if (numbers[i] == numbers[i + 1]) {
                numbers[i + 1] = numbers[lng] + v;
                v++;

            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
