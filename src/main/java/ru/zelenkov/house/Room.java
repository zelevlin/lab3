package ru.zelenkov.house;


import java.util.Objects;

public class Room{

   private String portraits[]=new String[3];

   private Object beds[]=new Bed[3];


    public Room(String name, String name2, String name3){
        setPortraits(name, name2);
        setBeds(name, name2, name3);
    }


    public void setPortraits(String name, String name2) {
        this.portraits[0] = name;
        this.portraits[1] = name2;
        this.portraits[2] = "другие собаки";
    }

    public void setBeds(String name, String name2, String name3) {
        Bed bed1 = new Bed(1,"Big", name);
        Bed bed2 = new Bed(2,"Big",name2);
        Bed bed3 = new Bed(3,"Small",name3);
        Bed arrBed []={bed1, bed2, bed3};
        this.beds = arrBed;
    }
    public String getPortraitsNames(){
        String out="";
        for (int i = 0; i < this.portraits.length; i++) {
            out+=this.portraits[i]+" ";
        }
        return out;
    }
    @Override
    public String toString(){
        return "Стены были украшены портретами " +this.getPortraitsNames()+"\nпосреди комнаты стояли "+beds.length +" кровати:"+
                beds[0].toString()+ beds[1].toString()+ beds[2].toString();
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.toString());
    }

}
