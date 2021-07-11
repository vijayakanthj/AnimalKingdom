package com.singtel.animal.actions;

public interface CanSwim extends AnimalActivity {
    default void swim() {
        System.out.println("I am swimming");
    }
}
