package com.pb.kusyj.hw6;

public class Veterinarian {
    public static void treatAnimal(Animal animals) {
        System.out.println(" пришел на прием."/*+animals.toString()*/+" Он ест"+ animals.getFood()+ ", место обитания: "+ animals.getLocation());
    }
}

/// +animals.toString() - если добавить, будет выводиться информация при помощи метода toString
// переменные (поля) характеризующие только этих животных, только из классов Dog, Cat, Horse.