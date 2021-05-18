package com.github.nestedclasses.nestedinterface.withininterface;

public class InnerInterfaceImplementation
  implements NestedInterfaceWithinInterface.NestedInterface {

  public void msg() {
    System.out.println("Hello, I'm a nested interface within an interface");
  }

  public static void main(String[] args) {
    //upcasting here
    NestedInterfaceWithinInterface.NestedInterface nestedInterface = new InnerInterfaceImplementation();
    nestedInterface.msg();

    //normal way of instantiating a class
    InnerInterfaceImplementation innerInterfaceImplementation = new InnerInterfaceImplementation();
    innerInterfaceImplementation.msg();
  }
}
