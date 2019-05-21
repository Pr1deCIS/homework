package hw_procedural.hw1_func;

import java.util.Scanner;

public class hw3_fucn {
    public static void main(String[] args) {
        double a, b, c, D;
        double d1, d2, d3;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        D = b * b - 4 * a * c;
        d1 = -b;
        d2 = Math.sqrt(D);
        d3 = 2 * a;

        if (D > 0) {
            double x1, x2;
            x1 = (d1 + d2) / d3;
            x2 = (d1 - d2) / d3;
            System.out.println("Корни уравнения : " + x1 + " " + x2);
        }
        if (D < 0) {
            System.out.println("Нет корней");
        }
        if (D == 0) {
            double x1;
            x1 = d1 / d3;
            System.out.println("Дискрименант равен нулю, единственный корень : " + x1);
        }
    }
}
