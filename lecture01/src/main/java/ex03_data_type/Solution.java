package ex03_data_type;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "DITI ";

        Scanner scan = new Scanner(System.in);

        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        scan.nextLine();
        String s2 = scan.nextLine();
        /* Объявите для каждого типа: целочисленный, с плавающей точкой двойной точности, строка - вторую переменную. */

        //TODO: заполните значение каждой переменной тем, что введено в стандартный поток ввода
        //К примеру:
        //5
        //3.14
        //is the best place to learn and practice coding!

        //TODO: Напечатайте сумму целых значений

        //TODO: Напечатайте сумму дробных чисел

        //TODO: напечатайте результат конкатенации строк

        scan.close();
        System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s+s2);
    }
}
