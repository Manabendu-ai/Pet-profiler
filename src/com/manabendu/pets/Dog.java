package com.manabendu.pets;

public class Dog extends Pet {

    public Dog(String name, int age){
        super(name, age, 8);
    }

    @Override
    public String describe(){
        return "Fun Dog Looking To Make Friends! "+super.describe();
    }

}