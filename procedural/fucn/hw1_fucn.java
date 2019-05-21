package hw_procedural.hw1_func;

import java.util.Scanner;

public class hw1_fucn {

    public static void main(String[] args) {
        int day, mnth, year, max_day;


        Scanner scanner = new Scanner(System.in);
        day = scanner.nextInt();
        {
            if (day > 0 && day <= 31) System.out.println("День : " + day);
            else System.exit(1);

        }
        mnth = scanner.nextInt();
        {
            if (mnth > 0 && mnth <= 12)
                System.out.println("Месяц : " + mnth);
            else System.exit(2);
        }

        year = scanner.nextInt();
        if (mnth % 2 == 0) {
            if (mnth == 2) {
                max_day = 28;
            } else {
                max_day = 30;
            }
        } else {
            max_day = 31;
        }
        day++;
        if (day > max_day) {
            mnth++;
            {
            }
            if (mnth >= 13) {
                mnth = 1;
                year++;
            }
        }
        if (day > max_day) {
            day = 1;
        }
        System.out.println("День : " + day + " Месяц : " + mnth + " Год :  " + year);
    }
}



