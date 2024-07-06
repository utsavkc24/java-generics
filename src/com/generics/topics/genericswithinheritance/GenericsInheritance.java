package com.generics.topics.genericswithinheritance;

import java.util.ArrayList;
import java.util.List;

//why we cannot pass A class to its superclass S in generics
//Ans - we are also allowing other children of class S to be passed
// for eg - below code will give the compilation errors,
// as we are passing Integer & String both to Object type to print the list
// Reasons, as you can type safety doesn't as we can any child of objects(see printList() methods)
//Solution - we can use wildcards(?), that's says send anything, any type
//now below code will not give CE
//What is wildcards, The question mark (?) is known as the wildcard in generic programming. It represents an unknown //type. The wildcard can be used in a variety of situations such as the type of a parameter, field, or local //variable; sometimes as a return type
public class GenericsInheritance {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Bruce");
        strings.add("Wayne");
        printList(strings);

        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(4);
        printList(integers);
    }

    private static void printList(List<?> objectsList) {
        objectsList.forEach(System.out::println);
        //But still by using wildcards, you can read(print) a list but cannot write to that list, hence below line will give compilation errors
//        objectsList.add("NO");
//        objectsList.add(1);
    }
}
