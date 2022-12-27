package ru.zelenkov.abstracts;

public abstract class Human {
    private String name;
    private String address="адрес";

    public Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
