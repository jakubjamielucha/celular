package com.company;

public class Contact {

    private String name;
    private String number;
    int id;



    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }

    public Contact(Contact source){
        this.name = source.name;
        this.number = source.number;
    }

    @Override
    public String toString() {
        return  "Name:" + name +
                "\tNumber: " + number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
