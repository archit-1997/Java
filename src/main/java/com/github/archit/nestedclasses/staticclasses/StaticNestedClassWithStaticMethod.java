package com.github.archit.nestedclasses.staticclasses;

public class StaticNestedClassWithStaticMethod {

  static int value = 10;

  static class StaticInnerClass {

    static void printValue() {
      System.out.println(
        "Value of the data member of the outer class : " + value
      );
    }
  }
  /*
  public static void main(String[] args) {
    StaticNestedClassWithStaticMethod.StaticInnerClass.printValue();
  }

   */
}
