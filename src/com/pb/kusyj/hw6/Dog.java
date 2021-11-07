package com.pb.kusyj.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String name;// = "Бастер";
    private String say; // = "Гав!";
    private String toDo = "грозно рычит";
    private int age; // = 4;
    private String typeOfAnimals; // = "Собака";

    private String height = "80см";
    private String food = " косточки и мясо.";
    private String location = "теплая, уютная будка";


    public Dog(String name, String say, int age, String typeOfAnimals, String food, String location) {
        this.name = name;
        this.say = say;
        this.age = age;
        this.typeOfAnimals=typeOfAnimals;
        this.food = food;
        this.location=location;
    }

    public Dog() {
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getTypeOfAnimals() {  return typeOfAnimals;    }

    public void setTypeOfAnimals(String typeOfAnimals) {   this.typeOfAnimals = typeOfAnimals;    }


    @Override
    public String toString() {
        return "[" + typeOfAnimals+
                ". Имя:'" + name + '\'' +
                ", говорю:'" + say + '\'' +
                ", делаю:'" + toDo + '\'' +
                ", возраст:" + age +
                " года, рост:'" + height + '\'' +
                ", ем:'" + food + '\'' +
                ", среда обитания'" + location + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name) && say.equals(dog.say);
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
        System.out.println(getTypeOfAnimals()+" "+getName()+ " очень любит грызть "+getFood());
    }
    public void makeNoise() {
        super.makeNoise();
        System.out.println(getTypeOfAnimals()+" "+getName()+", если его разозлить, "+getToDo());
    }

}
