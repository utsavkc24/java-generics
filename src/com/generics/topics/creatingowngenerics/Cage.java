package com.generics.topics.creatingowngenerics;

//Make sure it follows this order - E extends ParentClassName & Interface 1 & Interface2 ..... & Interface n
public class Cage<E extends Animal & Diet & Habitat> {

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

    //Now by implementing interface Diet and Habitat, we are saying this 'E' is also setting bounds with multiple type
    public void characteristics() {
        animal.diet();
        anotherAnimal.diet();

        animal.habitat();
        anotherAnimal.habitat();
    }
}
