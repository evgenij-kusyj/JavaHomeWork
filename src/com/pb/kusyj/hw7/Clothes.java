package com.pb.kusyj.hw7;

public abstract class Clothes  {
    protected String typeOfClothing;
    public String colour;
    public Float price;

    public Clothes (String typeOfClothing, /*int Size,*/String colour, float price) {
        this.typeOfClothing=typeOfClothing;
        this.colour=colour;
        this.price=price;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void dressMan() {
    }

    public void dressWomen() {
    }
}




//    Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
