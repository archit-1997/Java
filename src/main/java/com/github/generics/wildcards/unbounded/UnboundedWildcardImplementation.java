package com.github.generics.wildcards.unbounded;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardImplementation {

  public static void main(String[] args) {
    UnboundedWildcard unboundedWildcard = new UnboundedWildcard();

    //list of string
    List<String> stringList = new ArrayList<>();
    stringList.add("Java");
    stringList.add("C++");
    stringList.add("GO");
    //printing strings
    System.out.println("Printing list of strings");
    unboundedWildcard.display(stringList);

    //List of Integers
    List<Integer> integerList = new ArrayList<>();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);
    //printing integers
    System.out.println("Printing list of integers");
    unboundedWildcard.display(integerList);
  }
}
