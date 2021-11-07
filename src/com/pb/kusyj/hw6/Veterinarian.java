package com.pb.kusyj.hw6;

public class Veterinarian {
    public static void treatAnimal(Animal animals) {
        System.out.println("На прием пришел некто"/* +animals.toString()*/+", который есть "+ animals.getFood()+ " и живет "+ animals.getLocation());
    }
}
