package ru.itmo.java.basics.lesson1;

import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        int a = 46;
        int b = 10;
        int c = 3;
        int d = 29;
        int e = 4;
        int f = -15;
        double rez1 = (a + b) * ((double) b / c);
        int rez2 = (d) * (e) * (f);
        System.out.println("( 46 + 10 ) * ( 10 / 3 ) = " + rez1);
        System.out.println("( 29 ) * ( 4 ) * (- 15 ) = " + rez2);

        int number = 10500;
        double rez3 = ((double) (number) / 10) / 10;
        System.out.println("Результат вычислений с number равен " + rez3);

        double aa = 3.6;
        double bb = 4.1;
        double cc = 5.9;
        double rez4 = (aa) * (bb) * (cc);
        System.out.println("Произведение чисел 3.6, 4.1 и 5.9 равно " + rez4);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        if (num > 100 && num % 2 == 0) {
            System.out.println("Выход за пределы диапазона");
        } else if (num % 2 == 0) {
            System.out.println("Введено четное число");
        } else {
            System.out.println("Введено нечетное число");
        }
    }
}