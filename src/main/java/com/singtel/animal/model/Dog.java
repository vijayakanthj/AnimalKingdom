package com.singtel.animal.model;


import com.singtel.animal.actions.CanMakeSound;

public class Dog extends WalkingAnimal implements CanMakeSound {

    @Override
    public void makeSound() {
        System.out.println("Woof, woof");
    }
}
