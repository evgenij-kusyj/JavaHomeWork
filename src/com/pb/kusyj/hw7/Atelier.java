package com.pb.kusyj.hw7;

public class Atelier {
    public static void main(String[] args) {

        Clothes pants = new Pants("Брюки", Size.XXS, "белый", 100.5f);
        Clothes tshirt1 = new Tshirt("Футболка", Size.M, "красный", 180.0f);
        Clothes tshirt2 = new Tshirt("Футболка", Size.XS, "желтый", 150.0f);
        Clothes tie = new Tie("Галстук", Size.L, "синий", 80.0f);
        Clothes skirt = new Skirt("Юбка", Size.S, "черный", 130.5f);
        Clothes[] clothes = {pants, tshirt1, tshirt2, tie, skirt};

        // проверяем галстук (мужская одежда):
        if  (tie instanceof WomenClothes&&Size.L.euroSize<=32) {
            System.out.print("это детская одежда");
        }
        else if (tie instanceof WomenClothes&&Size.L.euroSize<=36) {
            System.out.print("Женская одежда: ");tie.dressWomen();
        }
        else {
            System.out.print("Мужская одежда: ");tie.dressMan();
        }
// проверяем футболку 1 (мужская одежда):
        if (tshirt1 instanceof WomenClothes&&Size.M.euroSize<=32) {
            System.out.print("это детская одежда");
        }
        else if (tshirt1 instanceof WomenClothes&&Size.M.euroSize<=36) {
            System.out.print("Женская одежда: ");tshirt1.dressWomen();
        }
        else {
            System.out.print("Мужская одежда: "); tshirt1.dressMan();
        }
// проверяем футболку 2 (женская одежда):
        if (tshirt2 instanceof WomenClothes&&Size.XS.euroSize<=32) {
            System.out.print("это детская одежда");
        }
        else if (tshirt2 instanceof WomenClothes&& Size.XS.euroSize<=32) {
            System.out.print("Это детская одежда: "); tshirt2.dressMan();
        }
        else if (tshirt2 instanceof WomenClothes&&Size.XS.euroSize<=36) {
            System.out.print("Женская одежда: ");tshirt2.dressWomen();
        }
        else {
            System.out.print("Мужская одежда: ");tshirt2.dressMan();
        }
// проверяем брюки (детская одежда):
        if (pants instanceof WomenClothes&& Size.XXS.euroSize<=32) {
            System.out.print("Это детская одежда: "); pants.dressMan();
        }
        else if (pants instanceof WomenClothes&&Size.XXS.euroSize<=36) {
            System.out.print("Женская одежда: ");pants.dressWomen();
        }
        else {
            System.out.print("Мужская одежда: ");pants.dressMan();
        }
// проверяем юбку (женская одежда):
        if (skirt instanceof WomenClothes&& Size.S.euroSize<=32) {
            System.out.print("это детская одежда");
        }
        else if (skirt instanceof WomenClothes&&Size.S.euroSize<=36) {
            System.out.print("Женская одежда: "); skirt.dressWomen();
        }
        else {
            System.out.print("Мужская одежда: "); skirt.dressMan();
        }
        System.out.print("Галстук - женская одежда: ");
        System.out.println(tie instanceof WomenClothes);
        System.out.print("Галстук - мужская одежда: ");
        System.out.println(tie instanceof ManClothes);

        Size size1 = Size.XXS;
        Size size2 = Size.XS;
        Size size3 = Size.S;
        Size size4 = Size.M;
        Size size5 = Size.L;

        System.out.println(size1.getDescription()+", "+size2.getDescription()+", "+size3.getDescription()+
                ", "+size4.getDescription()+", "+size5.getDescription());   // метод getDescription
        System.out.println(size1.getEuroSize()+", "+size2.getEuroSize()+", "+size3.getEuroSize()+
                ", "+size4.getEuroSize()+", "+size5.getEuroSize());         // метод getEuroSize
        System.out.println(" ");
        Size.description(); // метод  description()
        Size.euroSize();    // метод euroSize()

//      вывод информации по всем видам одежды
        pants.dressMan();           pants.dressWomen();
        tshirt1.dressMan();         tshirt1.dressWomen();
        tshirt2.dressMan();         tshirt2.dressWomen();
        tie.dressMan();             tie.dressWomen();
        skirt.dressMan();           skirt.dressWomen();

        dressMan(clothes);
        dressWomen(clothes);
    }
    private static void dressMan(Clothes[] clothes){
    //   if  (tie instanceof WomenClothes);
       System.out.println();
    }
    static void dressWomen(Clothes[] clothes) {

    }

}

/*
    Создать класс Atelier с методом main, и еще двумя статическими методами:
        dressMan(Clothes[] clothes)
        dressWomen(Clothes[] clothes)
        на вход которых будет поступать массив, содержащий все типы одежды.
        В методе main создать массив, содержащий все типы одежды, и вызвать методы dressMan и dressWomen
        передав туда этот массив.
        Метод dressWomen выводит на консоль всю информацию о женской одежде.
        Метод dressMan выводит на консоль всю информацию о мужской одежде.
        В методах dressWomen и dressMan использовать оператор instanceof для определения мужская это одежда
         или женская.

*/
