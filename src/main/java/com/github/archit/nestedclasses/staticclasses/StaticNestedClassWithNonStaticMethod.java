package com.github.archit.nestedclasses.staticclasses;

public class StaticNestedClassWithNonStaticMethod {

  static String name = "Data member : Outer class";

  static class InnerClass {

    void printMessage() {
      System.out.println("Hi !! I'm an inner class");
      //name is accessible only because it is static
      System.out.println(
        "I can access the data member of the outer class is : " + name
      );
    }
  }
  /*
  public static void main(String[] args) {
    //General way of creating an object of the inner class
    //InnerClass innerClass = new InnerClass();

    //Alternative way to create an instance of the inner class
    StaticNestedClassWithNonStaticMethod.InnerClass innerClass = new StaticNestedClassWithNonStaticMethod.InnerClass();
    innerClass.printMessage();
  }
   */
}
