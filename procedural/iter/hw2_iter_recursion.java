package hw_procedural.hw2_iter;

import java.util.Scanner;

class Fibonachi {

    int fibonachi(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

}

public class hw2_iter_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int e = b+1;

        Fibonachi fib = new Fibonachi();

        for (int c = 0; c <= e; c++) {
            int d = fib.fibonachi(e - c);

            if (b > d) {
               System.out.println(d); }


            }
        }
    }