package com.github.nestedclasses.innerclass.anonymousinnerclass;

public class AnonymousInnerClassFromConcreteClass {

  void printMessage() {
    System.out.println("I'm a concrete class");
  }

  public static void main(String[] args) {
    //creating anonymous inner class of the current class
    AnonymousInnerClassFromConcreteClass anonymousInnerClassFromConcreteClass = new AnonymousInnerClassFromConcreteClass() {
      //overriding the above method
      void printMessage() {
        System.out.println(
          "Hey, I'm an anonymous inner class, you can't tell my name"
        );
        System.out.println("I've also overridden your method");
      }
    };
    anonymousInnerClassFromConcreteClass.printMessage();
  }
}
