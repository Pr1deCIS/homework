package hw_procedural.hw4_string;

import java.util.Scanner;

public class Hw2_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String RIM = scanner.nextLine();
        Integer i = Integer.valueOf(RIM);
        String arb = "";
        if (i >= 1 & i <= 3999) {

            while (i >= 1000) {
                arb += "M";
                i -= 1000;
            }
            while (i >= 900) {
                arb += "CM";
                i -= 900;
            }
            while (i > +500) {
                arb += "D";
                i -= 500;
            }
            while (i >= 400) {
                arb += "CD";
                i -= 400;
            }
            while (i >= 100) {
                arb += "C";
                i -= 100;
            }
            while (i >= 90) {
                arb += "XC";
                i -= 90;
            }
            while (i >= 50) {
                arb += "L";
                i -= 50;
            }
            while (i >= 40) {
                arb += "XL";
                i -= 40;
            }
            while (i >= 10) {
                arb += "X";
                i -= 10;
            }
            while (i >= 9) {
                arb += "IX";
                i -= 9;
            }
            while (i >= 5) {
                arb += "V";
                i -= 5;
            }
            while (i >= 4) {
                arb += "IV";
                i -= 4;
            }
            while (i >= 1) {
                arb += "I";
                i -= 1;
            }


            System.out.println(arb);
        } else {
            System.out.println("Вы вышли за рамки условия задачи. ");
        }
    }
}