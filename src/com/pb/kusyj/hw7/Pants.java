package com.pb.kusyj.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants(String typeOfClothing, Size size, String colour, float price) {
        super(typeOfClothing, colour, price);
       /* System.out.println("Тип одежды: "+typeOfClothing+", размер: "+Size.XXS.getEuroSize()+" ("+Size.XXS.getDescription()+", "+Size.S+"), " +
                "цвет: "+colour+", цена: "+price+"грн."); */  }
    @Override
    public void dressMan() {
        System.out.println("Тип одежды: "+typeOfClothing+", размер: "+Size.XXS.getEuroSize()+" ("+Size.XXS.getDescription()+", "+Size.XXS+"), " +
                "цвет: "+colour+", цена: "+price+"грн.");
    }

    @Override
    public void dressWomen() {
    }
}

/*

    Создать классы наследники Clothes:
        - Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
*/
