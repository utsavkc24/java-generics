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
    //below code will give error saying -> 'com.generics.topics.creatingowngenerics.Cage.this' cannot be referenced from a static context
    //As ref instance variable 'E' in a static context & this E(not in above class def public class Cage<E extends Animal & Diet & Habitat> {) in below method
    //signature does'nt have type of the E(does'nt what is the type of 'E'), so we must explicitly tell in method sign, see after this method
//    public static boolean isCompatible(E animal, E anotherAnimal){
//        return animal.getType().equals(anotherAnimal.getType());
//    }

    // we are extending Animal also in method sign(<E extends Animal>) as we want to use getType()
    public static <E extends Animal> boolean isCompatible(E animal, E anotherAnimal) {
        return animal.getType().equals(anotherAnimal.getType());
    }
}
