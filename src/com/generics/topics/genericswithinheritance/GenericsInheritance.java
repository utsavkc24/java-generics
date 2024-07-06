package com.generics.topics.genericswithinheritance;

import java.util.ArrayList;
import java.util.List;

//why we cannot pass A class to its superclass S in generics
//Ans - we are also allowing other children of class S to be passed
// for eg - below code will give the compilation errors,
// as we are passing Integer & String both to Object type to print the list
// Reasons, as you can type safety doesn't as we can any child of objects(see printList() methods)
public class GenericsInheritance {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Bruce");
        strings.add("Wayne");
//        printList(strings); COMPILATION ERRORS

        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(4);
//        printList(integers); COMPILATION ERRORS
    }

    private static void printList(List<Object> objectsList) {
        objectsList.forEach(System.out::println);
        objectsList.add("NO");
        objectsList.add(1);
    }
}
