package com.manabendu.pets;

public class Cat extends Pet {

    public Cat(String name, int age){
        super(name, age, 8);
    }

    @Override
    public String describe(){
        return "Fun Cat Ready To Party! "+super.describe();
    }

}
