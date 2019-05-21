package hw_procedural.hw2_iter;

import java.util.Scanner;

public class hw1_iter {
    public static void main(String[] args) {
        int a, b;
        b = 0;

        Scanner In = new Scanner(System.in);
        a = In.nextInt();
        for (int i = a; i > 0; i /= 10) {
            b += i % 10;
        }
        System.out.println(b);
    }
}


