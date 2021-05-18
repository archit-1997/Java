package com.github.nestedclasses.nestedinterface.withinclass;

public class NestedInterfaceWithinClassImplementation
  extends NestedInterfaceWithinClass {

  public void msg() {
    System.out.println(
      "Hii, Im the implementation of the interface method inside the class"
    );
  }

  public static void main(String[] args) {
    NestedInterfaceWithinClassImplementation nestedInterfaceWithinClassImplementation = new NestedInterfaceWithinClassImplementation();
    nestedInterfaceWithinClassImplementation.msg();

    //method already implemented in the class
    nestedInterfaceWithinClassImplementation.printMessage();
  }
}
