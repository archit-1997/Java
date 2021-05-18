package com.github.nestedclasses.nestedinterface.withininterface;

public class OuterInterfaceImplementation
  implements NestedInterfaceWithinInterface {

  public void show() {
    System.out.println("Hi,I'm the method of the outer interface");
  }

  public static void main(String[] args) {
    OuterInterfaceImplementation outerInterfaceImplementation = new OuterInterfaceImplementation();
    outerInterfaceImplementation.show();
  }
}
