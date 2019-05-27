package hw_procedural.hw2_iter;

import java.util.Scanner;

public class hw2_iter_for {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] f = new int[n];

        f[0] = 0;
        f[1] = 1;


        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for (int i = 0; f[i] < n; i++) {
            System.out.println(f[i]);
        }
    }
}

