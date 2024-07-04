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


        //Below line, compiler doesn't perform type safety check
//        Cage<Monkey> anotherMonkeyCage = new Cage(new Monkey(), new Lion());
        //So, while using constructors with generic, we should add '<>' before const
        // args, to tell compiler to perform type safety check and hence it will compilation error
//        Cage<Monkey> anotherMonkeyCageWithCheck = new Cage<>(new Monkey(), new Lion());

    }
}
