package com.pb.kusyj.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String name;// = "Молния";
    private String say; // = "Иго и огого!";
    private String toDo = "заржал и ударил землю копытом";
    private int age; // = 2;
    private String typeOfAnimals; // = "Лошадь";

    private String type = "скакун";
    private String food = " сено и морковку (и никогда не отказывается от яблок)";
    private String location = "теплый, уютный хлев";



    public Horse(String name, String say, int age, String typeOfAnimals, String food, String location) {
        this.name = name;
        this.say = say;
        this.age = age;
        this.typeOfAnimals = typeOfAnimals;
        this.food = food;
        this.location=location;
    }
    public Horse() {

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

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                ". Имя:'" + name + '\'' +
                ", говорю:'" + say + '\'' +
                ", делаю:'" + toDo + '\'' +
                ", возраст:" + age +
                " года, тип:'" + type + '\'' +
                ", ем:'" + food + '\'' +
                ", среда обитания:'" + location + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return name.equals(horse.name) && say.equals(horse.say);
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
    public void eat() {
        super.eat();
        System.out.println(getTypeOfAnimals()+" "+getName()+ " никогда не откажется покушать "+getFood());
    }
    public void makeNoise() {
        super.makeNoise();
        System.out.println(getTypeOfAnimals()+" "+getName()+" произносит "+getSay());
    }
    // для приема ветеринара.
    public void name() {
        super.name();
        System.out.print(getTypeOfAnimals()+" "+getName());
    }
}
