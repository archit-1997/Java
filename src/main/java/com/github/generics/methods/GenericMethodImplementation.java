package com.github.generics.methods;

import java.util.ArrayList;

public class GenericMethodImplementation {

  public static <E> void printElements(E[] array) {
    for (E arrayElement : array) System.out.println(arrayElement);
  }

  //a generic method which takes in array and returns as ArrayList
  public static <E> ArrayList<E> getElementsAsListFromArray(E[] array) {
    ArrayList<E> arrayList = new ArrayList<>();
    //inserting elements into the list
    for (E arrayElement : array) arrayList.add(arrayElement);

    return arrayList;
  }

  public static void main(String[] args) {
    Integer[] integers = { 1, 2, 3, 4, 5 };
    String[] strings = { "generics", "lambdas", "collections" };
    System.out.println("Printing the elements from an array");

    printElements(strings);
    printElements(integers);

    System.out.println("Print the elements from a list");
    //here we know the return type of the method
    //because we know the type we are passing it
    //we also need to typecast the list to the type that we want
    ArrayList<Integer> genericIntegerList = (ArrayList<Integer>) getElementsAsListFromArray(
      integers
    );
    //print the elements of the list
    for (Integer listElement : genericIntegerList) System.out.println(
      listElement
    );

    ArrayList<String> genericStringList = (ArrayList<String>) getElementsAsListFromArray(
      strings
    );
    //print the elements of the list
    for (String listElement : genericStringList) System.out.println(
      listElement
    );
  }
}
