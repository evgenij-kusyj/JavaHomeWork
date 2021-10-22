package com.pb.kusyj.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Отгадайте число, заданное программой, в диапазоне от 0 до 100. \nДля выхода из программы введите 112.");
        int x = random.nextInt(101); // случайное число, выбранное программой
        System.out.println("Случайное число, заданное программой: " + x + ". \nВведите число:");
        final int MAX_attempt = 101;
        int attempt = 0;

        while (attempt < MAX_attempt) {
            attempt++;
            int y = scanner.nextInt();
            if (y == 112) {
                System.out.print("Вы вышли из игры.");
                break;
            } else if (y == x) {
                System.out.println("Вы угадали c " + attempt + " попытки.");
                System.out.println("Произведено " + attempt + " попыток.");
                break;
            } else if (y > x)
                System.out.println("Задуманное число меньше введенного Вами. \nУстали? Да поможет Вам 112.");
            else if (y < x)
                System.out.println("Задуманное число больше введенного Вами. \nУстали? Да поможет Вам 112.");
        }
        }
  }

