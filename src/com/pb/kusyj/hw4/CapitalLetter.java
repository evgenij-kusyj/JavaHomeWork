package com.pb.kusyj.hw4;
import java.util.Scanner;

public class CapitalLetter {

   static void upper() {
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();

       String[] words = str.split(" "); // Метод split() позволяет разбить строку на подстроки по определенному разделителю. Разделитель - какой-нибудь символ или набор символов передается в качестве параметра в метод

       for (int i = 0; i < words.length; i++)
       {
           words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
       }
       str = String.join(" ", words); // метод join() позволяет объединить строки с учетом разделителя
       System.out.println(str);
       }
    public static void main(String[] args) {
        System.out.println("Введите строку из нескольких слов:");
        upper();
    }
}
