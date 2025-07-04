package com.manabendu.pets;

public class GoldFish extends Pet {

    public GoldFish(String name, int age){
        super(name, age);
    }

    @Override
    public String describe(){
        return "Hello My Name is "+super.name+"!\nIam a Gold Fish. My age is "+super.age+".\nAnd I Swim all Day around!";
    }

}