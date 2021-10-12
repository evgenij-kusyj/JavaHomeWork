package com.pb.kusyj.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;

        x = scan.nextInt();

        System.out.println("x = " + x);

        // оператор if...else if...else
        if (x < 0) {
            System.out.print(" [введенное число не попадает в один из имеющихся промежутков}");
        } else if (x <= 14) {
            System.out.print(" [0-14]");
        } else if (x <= 35) {
            System.out.print(" [15-35]");
        } else if (x <= 50) {
            System.out.print(" [36-50]");
        } else if (x <= 100) {
            System.out.print(" [51-100]");
        } else {
            System.out.print(" введенное число не попадает в один из имеющихся промежутков");
        }
    }
}
