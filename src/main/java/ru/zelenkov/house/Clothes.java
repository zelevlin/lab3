package ru.zelenkov.house;

import ru.zelenkov.enums.TypeOfClothes;

import java.util.Objects;

public class Clothes {
    private TypeOfClothes typeOfClothes;
    private String name;
    public Clothes(TypeOfClothes typeOfClothes) {
        this.name = typeOfClothes.toString();
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.toString());
    }
}
