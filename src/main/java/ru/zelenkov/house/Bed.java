package ru.zelenkov.house;

import java.util.Objects;

public class Bed {
    private int id;
    private String size;
    private String owner;

    public Bed(int id, String size, String owner) {
        this.id = id;
        this.size = size;
        this.owner = owner;
    }

    public String getWhosBed(){
        return owner;
    }

    @Override
    public String toString() {
        return "\nномер "+ id +
                " размер " + size +
                " владелец " + owner;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.toString());
    }
}
