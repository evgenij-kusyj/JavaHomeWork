package com.pb.kusyj.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie (String typeOfClothing, Size size, String colour, float price) {
        super(typeOfClothing, colour, price);
       /* System.out.println("Тип одежды: "+typeOfClothing+", размер: "+Size.L.euroSize+" ("+Size.L.getDescription()+", "+Size.L+"), " +
                "цвет: "+colour+", цена: "+price+"грн.");
   */ }
        @Override
        public void dressMan (/*String typeOfClothing,int size, String colour,float price*/){
            System.out.println("Тип одежды: "+typeOfClothing+", размер: "+Size.L.getEuroSize()+" ("+Size.L.getDescription()+", "+Size.L+"), " +
                    "цвет: "+colour+", цена: "+price+"грн.");

        }
}

/*


    Создать классы наследники Clothes:
        - Tie (галстук) реализует интерфейс ManClothes.
*/
