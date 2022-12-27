package ru.zelenkov.heroes;

import ru.zelenkov.abstracts.Human;

import java.util.Objects;

public class Hostess extends Human {
    public Hostess(String name) {
        super(name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.toString());
    }
}
