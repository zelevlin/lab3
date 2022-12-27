package ru.zelenkov.heroes;

import java.util.Objects;

public class Dog {
    private String name;
    private static int counter;

    public Dog(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        Dog c = (Dog) o;
        return Objects.equals(name, c.name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.toString());
    }
}
