package com.singtel.animal.model;


import com.singtel.animal.actions.CanMakeSound;

public class Chicken extends WalkingAnimal implements CanMakeSound {

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }

}
