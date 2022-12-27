package ru.zelenkov.heroes;

import ru.zelenkov.abstracts.Human;
import ru.zelenkov.interfaces.*;

import java.util.Objects;

public class Dunno extends Human implements HaveToPayFor,AbleToPay, AbleToBring, AbleToGet, AbleToLeave {
    public Dunno(String name){
        super(name);
    }
    private int salary=0;

    public boolean isSalaryExist(){
        if (salary == 0){
            return false;
        } else {
            return true;
        }
    }
    public String ableToPay(){
        return "может заплатить";
    }
    public String haveToPayFor(){
        return "должен заплатить за";
    }
    public String bring(){
        return "принести";
    }
    public String getSalary(){
        return "получить жалованье";
    }
    public String leave(){
        return "удалился";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        Dunno c = (Dunno) o;
        return Objects.equals(salary, c.salary);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.toString());
    }
}
