package com.singtel.animal.actions;

public interface CanFly extends AnimalActivity {

    default void fly() {
        System.out.println("I am flying");
    }
}
