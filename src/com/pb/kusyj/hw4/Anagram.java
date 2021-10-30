package com.pb.kusyj.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    private static String isAnagram(String an1, String an2) {
        if (an1 == null || an2 == null || an1.equals("") || an2.equals("") ||
                !an1.matches("[А-Яа-яA-Za-z-,.!><?_ ]+")
                || !an2.matches("[А-Яа-яA-Za-z-,.!><?_ ]+")) {
            return "Не анаграмма.";
        }
        String answer = "";

        String one = an1.replaceAll("[-,.!><?_ ]+", "");
        String two = an2.replaceAll("[-,.!><?_ ]+", "");

        if (one.equals("") || two.equals("")) {
            return "Не анаграмма.";
        }
        char[] arrayOne = one.toCharArray();
        char[] arrayTwo = two.toCharArray();
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        if (Arrays.equals(arrayOne, arrayTwo)) {
            answer = "Анаграмма.";
        } else {
            answer = "Не анаграмма.";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Проверка - являются ли строки анаграммой.");

        System.out.println("Введите строку 1: ");
        String an1 = in.nextLine().toUpperCase();

        System.out.println("Введите строку 2: ");
        String an2 = in.nextLine().toUpperCase();

        String result = isAnagram(an1, an2);
        System.out.println(result);
    }
}

