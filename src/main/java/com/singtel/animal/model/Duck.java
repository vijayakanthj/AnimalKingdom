package com.singtel.animal.model;


import com.singtel.animal.actions.CanMakeSound;
import com.singtel.animal.actions.CanSwim;

public class Duck extends FlyingBird implements CanMakeSound, CanSwim {

    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }
}
