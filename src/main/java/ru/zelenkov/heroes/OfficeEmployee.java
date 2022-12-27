package ru.zelenkov.heroes;

import ru.zelenkov.abstracts.Human;
import ru.zelenkov.interfaces.AbleToSay;
import ru.zelenkov.interfaces.AbleToWrite;

import java.util.Objects;

public class OfficeEmployee extends Human implements AbleToWrite, AbleToSay {
    public OfficeEmployee(String name){
        super(name);
    }

    public void write(String name, String name2, String address){
        String methodName = " "+new Throwable().getStackTrace()[0].getMethodName()+" ";
        System.out.println(OfficeEmployee.this.getName()+methodName+ name + " имя, а также "+
                Hostess.class.getSimpleName()+" имя "+ name2 +" и " + address+".");
    }
    public void say(Dunno obj){
        String methodName =" "+ new Throwable().getStackTrace()[0].getMethodName()+" ";

        System.out.println("после" +methodName+"что "+obj.getName()+" "+ obj.haveToPayFor()
        + " услуги конторы фертинг;");

        if(!obj.isSalaryExist()){
            System.out.println("если "+obj.ableToPay()+" = "+ obj.isSalaryExist()+", тогда "
                    +obj.bring()+", когда "+ obj.getSalary()+" = "+ !obj.isSalaryExist());
        }
    }

    @Override
    public String toString() {
        return "OfficeEmployee";
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.toString());
    }
}
