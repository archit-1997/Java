package com.github.nestedclasses.innerclass.anonymousinnerclass;

public class AnonymouseInnerClassFromInterface {

  public static void main(String[] args) {
    //anonymous inner class from an interface
    //overriding the interface method without implementing the interface
    //this is with the help of an inner class
    InterfaceForAnonymousClass interfaceForAnonymousClass = new InterfaceForAnonymousClass() {
      @Override
      public void bark() {
        System.out.println("I am a dog, bhow!! bhow!! bhow!!");
      }
    };
    interfaceForAnonymousClass.bark();
  }
}
