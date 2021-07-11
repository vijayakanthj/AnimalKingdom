package com.singtel.animal.model;


import com.singtel.animal.actions.Transformable;

public class Caterpillar extends WalkingAnimal implements Transformable {

    @Override
    public Animal transform() {
        return new Butterfly();
    }
}
