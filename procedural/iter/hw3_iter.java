package hw_procedural.hw2_iter;

import java.util.Scanner;

public class hw3_iter {

    public static void main(String[] args) {
        int a, b, c, d,f,g;
        b = 0;
        c = 0;
        d = 0;
        g = 0;

        Scanner days = new Scanner(System.in);
        System.out.println("Введите число дней : ");
        a = days.nextInt();
        for (int e = 1; e <= a; e++) {
            System.out.println("Введите число осадков : ");
            d = days.nextInt();
            // System.out.println("Осадков за день : " + d);
            c += d;
            if (g < d) {
                g = d;
            }
        }

        f = c/a;
        System.out.println("Количество дней : " + a);
        System.out.println("Сумма осадков : " + c);
        System.out.println("Среднее количество осадков в день: " + f);
        System.out.println("Максимальное значение осадков за день : " + g);

    }
}
