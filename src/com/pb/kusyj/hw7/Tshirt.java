package com.pb.kusyj.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt (String typeOfClothing, Size size, String colour, float price) {
        super(typeOfClothing, colour, price);
        /*System.out.println("Тип одежды: "+typeOfClothing+", размер: "+Size.M.euroSize+" ("+Size.M.getDescription()+", "+Size.M+"), " +
                "цвет: "+colour+", цена: "+price+"грн.");*/
            }

    @Override
    public void dressMan() {
        System.out.println("Тип одежды: "+typeOfClothing+", размер: "+Size.M.euroSize+" ("+Size.M.getDescription()+", "+Size.M+"), " +
                "цвет: "+colour+", цена: "+price+"грн.");

    }

    @Override
    public void dressWomen() {
        System.out.println("Тип одежды: "+typeOfClothing+", размер: "+Size.XS.getEuroSize()+" ("+Size.XS.getDescription()+", "+Size.XS+"), " +
                "цвет: "+colour+", цена: "+price+"грн.");

    }
}

/*

    Создать классы наследники Clothes:
        - Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
*/
