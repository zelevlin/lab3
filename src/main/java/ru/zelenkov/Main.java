package ru.zelenkov;


import ru.zelenkov.enums.TypeOfClothes;
import ru.zelenkov.heroes.*;
import ru.zelenkov.house.Clothes;
import ru.zelenkov.house.Cupboard;
import ru.zelenkov.house.Room;


public class Main {
    public static void main(String[] args) {
        OfficeEmployee officeEmployee = new OfficeEmployee("Сотрудник конторы");
        Dunno dunno = new Dunno("Незнайка");
        Hostess hostess = new Hostess("госпожа Минога");
        officeEmployee.write(dunno.getName(), hostess.getName(), hostess.getAddress());
        officeEmployee.say(dunno);
        Dog dog1 = new Dog("Роланд");
        Dog dog2 = new Dog("Мимишка");
        Servant servant = new Servant("служанка");
        System.out.println(dunno.getName()+" "+ dunno.leave()+" вместе с "+Dog.getCounter()+" собаками, "
        +hostess.getName()+", "+ servant.getName());
        Room room = new Room(dunno.getName(), dog1.getName(), dog2.getName());
        System.out.println(room.toString());

        Clothes[] arrCloth = new Clothes[TypeOfClothes.values().length];
        int i=0;
        for (TypeOfClothes c: TypeOfClothes.values()) {
            arrCloth[i] = new Clothes(c);
            i++;
        }
        Cupboard cupboard = new Cupboard(arrCloth);
        System.out.println("У стены стоял зеркальный шкаф в котором хранились: "+ cupboard.getKeptContent());



    }
}