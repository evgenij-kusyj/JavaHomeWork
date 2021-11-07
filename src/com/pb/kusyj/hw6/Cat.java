package com.pb.kusyj.hw6;

import java.util.Objects;
import java.util.PrimitiveIterator;

public class Cat extends Animal {
    private String breed = "Спартанец! Тьфу ты, британец я! Ну ладно - нечистокровный...";
    private String name;// = "Кузя";
    private String say;  // = "Мяу!";
    private int age;  // = 3;
    private String typeOfAnimals; // = "Кот";

    private String toDo = "сворачивается в клубочек";
    private String food = " молоко и рыбку.";
    private String location = "теплый, уютный дом";

    public Cat(String name, String say, int age, String typeOfAnimals, String food, String location) {
        this.name = name;
        this.say = say;
        this.age = age;
        this.typeOfAnimals = typeOfAnimals;
        this.food = food;
        this.location=location;
    }

    public Cat() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public String getTypeOfAnimals() {
        return typeOfAnimals;
    }

    public void setTypeOfAnimals(String typeOfAnimals) {
        this.typeOfAnimals = typeOfAnimals;
    }


    @Override
    public String toString() {
        return "[" + typeOfAnimals+
                ". Порода:'" + breed + '\'' +
                ", имя:'" + name + '\'' +
                ", говорю:'" + say + '\'' +
                ", возраст:" + age +
                " года, делаю:'" + toDo + '\'' +
                ", ем:'" + food + '\'' +
                ", среда обитания:'" + location + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name) && say.equals(cat.say);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, say);
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    public void sleep() {
        super.sleep();
        System.out.println(getTypeOfAnimals() +" "+ getName() + " спит.");
    }
    public void eat() {
        super.eat();
        System.out.println(getTypeOfAnimals()+" "+getName()+ " очень любит "+getFood());
    }
    public void makeNoise() {
        super.makeNoise();
        System.out.println(getTypeOfAnimals()+" "+getName()+" очень вежливо говорит "+getSay()+" и "+ getToDo());
    }
}
