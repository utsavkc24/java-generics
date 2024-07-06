package com.generics.topics.genericswithinheritance;

import java.util.ArrayList;
import java.util.List;

//There may be times when you'll want to restrict the kinds of types that are allowed to be passed to a type
// parameter. For example, a method that operates on numbers might only want to accept instances of Number or its
// subclasses.(we are setting up limit to accepting type as numbers)
//To declare an upper bounded Wildcard parameter, list the ?, followed by the extends keyword,
// followed by its upper bound.
public class UpperboundWildcard {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        integerList.add(8);
        printList(integerList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2d);
        doubleList.add(4d);
        printList(doubleList);
    }

    private static void printList(List<? extends Number> objectsList) {
        objectsList.forEach(System.out::println);
    }
}
