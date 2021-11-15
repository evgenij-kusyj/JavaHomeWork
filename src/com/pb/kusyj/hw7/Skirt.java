package com.pb.kusyj.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(String typeOfClothing, Size size, String colour, float price) {
        super(typeOfClothing, colour, price);
      /*  System.out.println("Тип одежды: "+typeOfClothing+", размер: "+Size.S.getEuroSize()+" ("+Size.S.getDescription()+", "+Size.S+"), " +
                "цвет: "+colour+", цена: "+price+"грн.");*/    }

        @Override
        public void dressWomen () {
            System.out.println("Тип одежды: "+typeOfClothing+", размер: "+Size.S.getEuroSize()+" ("+Size.S.getDescription()+", "+Size.S+"), " +
                    "цвет: "+colour+", цена: "+price+"грн.");
        }
}
/*
    Создать классы наследники Clothes:
        - Skirt (юбка) реализует интерфейс WomenClothes,
*/
