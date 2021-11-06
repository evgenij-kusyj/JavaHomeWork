package com.pb.kusyj.hw6;

public class Veterinarian {
    public static void treatAnimal(Animal animal) {
        System.out.println("На прием пришел"+ animal + "который есть "+ animal.getFood()+ "и живет "+ animal.getLocation());
    }
}

//усть этот метод печатает на экран food и location пришедшего на прием животного.
