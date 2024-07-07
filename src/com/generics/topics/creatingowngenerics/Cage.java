package com.generics.topics.creatingowngenerics;

public class Cage<E extends Animal> {

    private E animal;
    private E anotherAnimal;

    public Cage() {
    }

    public Cage(E animal, E anotherAnimal) {
        this.animal = animal;
        this.anotherAnimal = anotherAnimal;
    }

    public E getAnimal() {
        return animal;
    }

    public void setAnimal(E animal) {
        this.animal = animal;
    }

    public E getAnotherAnimal() {
        return anotherAnimal;
    }

    public void setAnotherAnimal(E anotherAnimal) {
        this.anotherAnimal = anotherAnimal;
    }
}
