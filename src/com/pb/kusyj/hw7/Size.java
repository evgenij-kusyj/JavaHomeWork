package com.pb.kusyj.hw7;

public enum Size {
    XXS("детский размер", 32),
    XS ("взрослый размер", 34),
    S("взрослый размер", 36),
    M("взрослый размер", 38),
    L("взрослый размер", 40);

    String description;
    int euroSize;

    private Size (String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public static void description() {
        System.out.println(Size.XXS.getDescription()+", "+Size.XS.getDescription()+", "+Size.S.getDescription()+
                ", "+Size.M.getDescription()+", "+Size.L.getDescription());
    }
    public static void euroSize() {
        System.out.println(Size.XXS.getEuroSize()+", "+Size.XS.getEuroSize()+", "+Size.S.getEuroSize()+
                ", "+Size.M.getEuroSize()+", "+Size.L.getEuroSize());
    }

    public String getDescription() {
    return description;}

    public int getEuroSize() {
        return euroSize;
    }
}

   /*

    Создать пакет hw7 и в нем создать перечисление (enum) Size со значениями
XXS, XS, S, M, L. Перечисление содержит метод getDescription(), возвращающий строку для XXS "Детский размер",
        для остальных "Взрослый размер". Так же перечисление должно иметь метод getEuroSize() возвращающий
        числовое значение (32, 34, 36, 38, 40) соответствующее каждому размеру.
        Создать конструктор принимающий на вход description и euroSize.
*/
