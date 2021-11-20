package com.pb.kusyj.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите логин для регистрации: ");
        String login = scan.nextLine();

        System.out.print("Введите пароль для регистрации: ");
        String password = scan.nextLine();

        System.out.print("Повторите пароль для подтверждения регистрации: ");
        String confirmPassword = scan.nextLine();

        Auth user = new Auth(login, password, confirmPassword);

        try {
            user.signUp(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            e.printStackTrace();
            System.out.print("Login содержит только латинские буквы и цифры, не менее 5 и не более 20 символов. ");
        } catch (WrongPasswordException e) {
          //  e.printStackTrace();
            System.out.print(e.getMessage());
        }
        System.out.println("Сохраняем данные пользователя 1: "+user.login + ", "+ user.password+", " + user.password1+", "+user.login1);

        System.out.print("Введите логин для входа: ");
        String login1 = scan.nextLine();
        System.out.print("Введите пароль для входа: ");
        String password1=  scan.nextLine();

        try {
            user.signIn(login1,password1);
        } catch (WrongLoginException e) {
          //  e.printStackTrace();
            System.out.print("login и password не соответствуют значениям из полей класса");
        }
    }
}

