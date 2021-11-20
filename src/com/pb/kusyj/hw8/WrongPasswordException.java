package com.pb.kusyj.hw8;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String пароль_не_соответствует_требуемым_параметрам) {
         super(пароль_не_соответствует_требуемым_параметрам);
    }
    public WrongPasswordException(String Пароли_не_совпадают, String p) {
        super(Пароли_не_совпадают+p);
    }
}
