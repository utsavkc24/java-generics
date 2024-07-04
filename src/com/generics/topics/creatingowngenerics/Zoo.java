package com.generics.topics.creatingowngenerics;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage<>();
        monkeyCage.setAnimal(new Monkey());
        monkeyCage.setAnimal(new Monkey());

        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal(new Lion());
        lionCage.setAnimal(new Lion());

        //THESE WILL COMPILATION ERROR
//        monkeyCage.setAnimal(new Lion());
//        lionCage.setAnimal(new Monkey());
    }
}
