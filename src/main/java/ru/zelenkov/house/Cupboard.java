package ru.zelenkov.house;

import ru.zelenkov.interfaces.AbleToKeep;

import java.util.Objects;

public class Cupboard implements AbleToKeep {
private Clothes[] clothes;

    public Cupboard(Clothes[] clothes ) {
        this.clothes = clothes;
    }
    public String getKeptContent(){
        String out ="";
        for (int i = 0; i < clothes.length; i++) {
            out+=clothes[i].getName()+" ";
        }
        return out;

    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.toString());
    }
}
