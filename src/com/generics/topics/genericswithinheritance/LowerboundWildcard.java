package com.generics.topics.genericswithinheritance;

import java.util.ArrayList;
import java.util.List;

//This restricts the unknown type to be a specific type or super-type of that type
public class LowerboundWildcard {
    // Method to add numbers to a list
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);

        System.out.println("Number List: " + numberList);

        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);

        System.out.println("Object List: " + objectList);


        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);

        System.out.println("Integer List: " + integerList);


        List<Double> doubleList = new ArrayList<>();
//        Below line will give compilation error, So the above function accepts List<Integer> & List<Number> but NOT List<Double> .
//        addNumbers(doubleList);

        System.out.println("Object List: " + doubleList);
    }
}
