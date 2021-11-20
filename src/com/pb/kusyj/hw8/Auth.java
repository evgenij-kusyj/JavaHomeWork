package com.pb.kusyj.hw8;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Auth {
    String login;
    String password;
    String confirmPassword;
    String login1;
    String password1;
    private Scanner scan;

    public Auth(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword=confirmPassword;
    }
    public void signUp(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!Pattern.matches("\\w[a-zA-Z0-9]{4,20}", login)) {
            throw new WrongLoginException();
        } else if (!Pattern.matches("\\w[a-zA-Z0-9_]{4,20}", password)) {
            throw new WrongPasswordException("Пароль не соответствует требуемым параметрам!\n");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!\n");
        } else {
            System.out.println("Регистрация прошла успешно!");
            System.out.println("Сохраняем Ваши данные: логин " + this.login + ", пароль " + this.password);
        }
    }

    public void signIn(String login1, String password1) throws WrongLoginException {
        if (!login1.equals(login)) {
            throw new WrongLoginException();
        }
        else if (!password1.equals(password)) {
            throw new WrongLoginException();
        }
        else if (!Pattern.matches("\\w[a-zA-Z0-9]{4,20}", login1)) {
            throw new WrongLoginException();
        }
        else if (!Pattern.matches("\\w[a-zA-Z0-9_]{4,20}", password1)) {
            throw new WrongLoginException();
        }
        else {
            System.out.println("Вход произошел успешно!");
        }
    }
}




