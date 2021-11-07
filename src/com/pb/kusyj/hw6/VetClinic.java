package com.pb.kusyj.hw6;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;

public class VetClinic {
    public static void main(String[] arg) throws Exception {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Кузя", "мяу", 3, "Кот", " молоко и рыбку.", "теплый, уютный дом");
        animals[1] = new Dog("Бастер", "Гав!", 4, "Собака", " косточки и мясо.", "теплая, уютная будка");
        animals[2] = new Horse("Молния", "Игого и огого!", 2, "Лошадь", "сено и морковку.", "теплый, уютный хлев");

        System.out.println(animals[0]);
        System.out.println(animals[1]);
        System.out.println(animals[2]);

        System.out.println("eq 1 2" + animals[0].equals(animals[1]));
        System.out.println("eq 1 3" + animals[0].equals(animals[2]));
        System.out.println("eq 2 3" + animals[1].equals(animals[2]));
        System.out.println("eq all " + animals[0].equals(animals[0]) + " " + animals[1].equals(animals[2]) + " " + animals[2].equals(animals[2]));

        System.out.println("hashCode 1: " + animals[0].hashCode());
        System.out.println("hashCode 2: " + animals[1].hashCode());
        System.out.println("hashCode 3: " + animals[2].hashCode());

        animals[0].makeNoise();
        animals[0].eat();
        animals[1].makeNoise();
        animals[1].eat();
        animals[2].makeNoise();
        animals[2].eat();
        animals[0].sleep();

        Animal[] x = new Animal[3];
        x[0] = new Cat();
        x[1] = new Dog();
        x[2] = new Horse();
        for (int i = 0; i < x.length; i++) {
            Veterinarian.treatAnimal(x[i]);

            Class vetClazz = Class.forName("com.pb.kusyj.hw6.Veterinarian");
            Constructor vet = vetClazz.getConstructor(new Class[]{});
            Object obj = vet.newInstance();
        }
    }
}

      //  if (obj instanceof Veterinarian) {
          //  ((Veterinarian) obj).();

       // }

       /*  Veterinarian vet = new Veterinarian();
        Class clazz = vet.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getMethods());
        System.out.println(Arrays.toString(clazz.getMethods()));
*/

