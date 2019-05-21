package hw_procedural.hw4_string;

import java.util.Scanner;

public class Hw1_string {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String str = string.nextLine();
        boolean Check = false;
        String variable = str;
        str = str.replaceAll("\\w","");

        StringBuffer rev = new StringBuffer(variable).reverse();

        String strRev = rev.toString();

        if (variable.equalsIgnoreCase(strRev)) {

            System.out.println("Является");
        } else
            System.out.println("Не является");
    }

}

