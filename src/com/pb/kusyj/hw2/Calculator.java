package com.pb.kusyj.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x, y;
        char sign;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 1");
        x = scan.nextInt();
        System.out.println("Введите число 2");
        y = scan.nextInt();
        System.out.print("Введите знак арифметической операции: +, -, *, /");
        sign = scan.next().charAt(0);

        switch (sign) {
            case '+':
                System.out.println("Ответ: " + (x + y));
                break;
            case '-':
                System.out.println("Ответ: " + (x - y));
                break;
            case '*':
                System.out.println("Ответ: " + (x * y));
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Ошибка операции: деление на 0 невозможно");
                } else if (y != 0) {
                    System.out.println("Ответ: " + (x / y));
                }
                break;
        }
    }
}
