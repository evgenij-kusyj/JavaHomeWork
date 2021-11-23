package com.pb.kusyj.hw9;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) throws Exception {
        System.out.println("Создаем массив из чисел, формат 10х10:");
        createNumbersFile();
        createOddNumbersFile();
    }
    private static void createNumbersFile() {
        try (Writer file = new FileWriter("C:\\Users\\Евгений\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\" +
                "kusyj\\hw9\\numbers.txt")) {
            Random random = new Random();
            int[][] arrey = new int[10][10];
            for (int i = 0; i < arrey.length; i++, System.out.println()) {
                for (int j = 0; j < arrey.length; j++) {
                    arrey[i][j] = (random.nextInt(100)); //  ((int) (Math.random() * 100)); //второй вариант,
                    System.out.print(arrey[i][j] + " ");
                    file.write(arrey[i][j] + " ");
                }
                file.write("\n");
            }
            System.out.println("---------------------------------");
        } catch (IOException e) {
            e.getStackTrace();
            System.out.println("Ошибка! " + e);
        }
    }
    private static void createOddNumbersFile() {
        try (Scanner in = new Scanner(new File("C:\\Users\\Евгений\\IdeaProjects\\JavaHomeWork" +
                "\\src\\com\\pb\\kusyj\\hw9\\numbers.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\Евгений\\IdeaProjects" +
                     "\\JavaHomeWork\\src\\com\\pb\\kusyj\\hw9\\odd-numbers.txt"));)   {
            System.out.println("Вывод, с учетом замены целых четных чисел на '0':");
            while (in.hasNextLine()) {
            Scanner line = new Scanner(in.nextLine());

            while (line.hasNextInt()) {
                int replacement = line.nextInt();
                if (replacement % 2 == 0) {
                    System.out.print("0 ");
                    replacement = 0; // переносит значение "0" вместо четного числа в документ  "odd-numbers.txt"
                } else
                    System.out.print(replacement + " ");
                out.print(replacement + " "); // переносит все числа в документ  "odd-numbers.txt"
            }
            line.close();
            out.println();
            System.out.println();
        }
        } catch (IOException x) {
            x.getStackTrace();
            System.out.println("Ошибка!" + x);
        }
   }
}
