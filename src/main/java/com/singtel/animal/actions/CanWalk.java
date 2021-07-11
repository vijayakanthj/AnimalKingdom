package com.singtel.animal.actions;

public interface CanWalk extends AnimalActivity {
    default void walk() {
        System.out.println("I am walking");
    }
}
