package com.pb.kusyj.hw6;
import java.util.Objects;

public class VetClinic {
    public static void main(String[] arg) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Кузя", "мяу", 3, "Кот");
        animals[1] = new Dog("Бастер", "Гав!", 4, "Собака");
        animals[2] = new Horse("Молния", "Иго и огого!", 2, "Лошадь");

        System.out.println(animals[0]);
        System.out.println(animals[1]);
        System.out.println(animals[2]);

        System.out.println("eq 1 2" + animals[0].equals(animals[1]));
        System.out.println("eq 1 3" + animals[0].equals(animals[2]));
        System.out.println("eq 2 3" + animals[1].equals(animals[2]));
        System.out.println("eq all " + animals[0].equals(animals[0])+" "+ animals[1].equals(animals[2])+" "+ animals[2].equals(animals[2]));

        System.out.println("hashCode 1: " + animals[0].hashCode());
        System.out.println("hashCode 2: " + animals[1].hashCode());
        System.out.println("hashCode 3: " + animals[2].hashCode());



       // Animal.treatAnimal();

     // animals[0].eat("Repz");


    }
}
