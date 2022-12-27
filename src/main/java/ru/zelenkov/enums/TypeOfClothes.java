package ru.zelenkov.enums;

public enum TypeOfClothes {
    DOG_FUF("фуфайки"), SHUB("шубейки"), POP("попонки"), JILET("жилетики"), NIGHT("пижамки"), EVEN_PAN("панталончики");
    private String name;

    TypeOfClothes(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
