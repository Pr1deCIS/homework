package hw_procedural.hw1_func;

import java.util.Scanner;

public class hw2_fucn {
    public static void main(String[] args) {
        int a, b, c, d, e, f, h1, h2, sqt;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
        f = scanner.nextInt();

        h1 = a * b;
        h2 = c * d;
        sqt = e * f;

        System.out.println("Площадь 1 дома : " + h1 + " Площадь второго дома : " + h2 + " Площадь участка : " + sqt);
        if (h1+h2<sqt){
            System.out.println("Дома вмещаются на участке ");}
            else System.out.println("Нельзя сотворить здесь ");

        }
    }

