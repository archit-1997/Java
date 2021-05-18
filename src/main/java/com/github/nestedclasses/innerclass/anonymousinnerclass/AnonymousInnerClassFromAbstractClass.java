package com.github.nestedclasses.innerclass.anonymousinnerclass;

public abstract class AnonymousInnerClassFromAbstractClass {

  public abstract void bark();

  public void eat() {
    System.out.println(
      "I'm an omnivores animal. I eat vegetables as well as flesh"
    );
  }

  public static void main(String[] args) {
    AnonymousInnerClassFromAbstractClass anonymousInnerClassFromAbstractClass = new AnonymousInnerClassFromAbstractClass() {
      @Override
      public void bark() {
        //implementing the abstract method bark in this anonymous inner class
        System.out.println("I'm a dog. I'm also an omnivore");
      }
    };

    anonymousInnerClassFromAbstractClass.bark();
    anonymousInnerClassFromAbstractClass.eat();
  }
}
