package com.singtel.animal.model;


import com.singtel.animal.actions.CanMakeSound;

public class Cat extends WalkingAnimal implements CanMakeSound {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
