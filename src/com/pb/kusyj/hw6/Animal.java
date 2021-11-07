package com.pb.kusyj.hw6;
import java.util.Objects;
public class Animal {

    private   String food;
    private String location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // специально для приема у ветеринара. Метод будет переопределен в каждом животном
    public void name() {
        System.out.print("");
    }

    public void makeNoise() {
        System.out.print( "Говорит. ");
    }
    public void eat() {
        System.out.print("Любит есть. ");
    }
    public void sleep() {
        System.out.println(" Собака Бастер спит.");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return food.equals(animal.food) && location.equals(animal.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
