package com.manabendu.pets;

public abstract class Pet {
    int age = 0;
    String name = "";
    int multiplier = 1;

    public Pet(String name, int Age){
        this.age = Age;
        this.name = name;
    }

    public Pet(String name, int age, int multiplier){
        this.name = name;
        this.age = age;
        this.multiplier = multiplier;
    }

    public String describe(){
        return "\nHello, This is " + name + " I am " + calculateAge() + "\nin human years!";
    }

    public int calculateAge(){
        return age*multiplier;
    }

}
