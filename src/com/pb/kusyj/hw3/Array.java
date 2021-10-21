package com.pb.kusyj.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите элемент[" + i + "] = ");
            array[i] = in.nextInt();
        }
            int x;
            x = array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9];
            System.out.println("Сумма всех элементов массива = " + x);

            int y = 0;
            for(int i = 0; i < array.length; i++) {
                if(array[i]> 0) {
                    y++;
            }
        }
        System.out.println("Количество положительных элементов: " + y);

        Arrays.sort(array);
            System.out.println("Элементы с положительным значением: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    System.out.println(" " + array[i]);
                }
            }

        boolean sorted = false;
        int z;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    sorted = false;

                    z = array[i];
                    array[i] = array[i+1];
                    array[i+1] = z;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}

