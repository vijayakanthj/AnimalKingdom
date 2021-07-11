package com.singtel.animal.model;


import com.singtel.animal.actions.CanSwim;
import com.singtel.animal.actions.FishAction;

public abstract class Fish implements Animal, CanSwim, FishAction {
    private String size;
    private String colour;

    public Fish(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }
}
