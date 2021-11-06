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

    public void makeNoise(String name, String say) {
        System.out.println(name + " говорит "+ say);
    }
    public void eat(String...name) {
        System.out.println(name + " любит есть ");
    }
    public void sleep(String Animal[]) {
        System.out.println(Animal[1] + " спит.");

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
}
