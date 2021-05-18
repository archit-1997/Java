package com.github.nestedclasses.nestedinterface.withinclass;

public class NestedInterfaceWithinClass {

  void printMessage() {
    System.out.println("Hi, I'm outside the interface but inside the class");
  }

  //nested interface inside the class
  interface InnerInterface {
    public void msg();
  }
}
