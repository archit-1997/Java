package com.github.nestedclasses.innerclass.localinnerclass;

public class LocalInnerClass {

  int value = 20;

  void showLocalInnerClass() {
    class InnerClass {

      void printValue() {
        System.out.println("Hi !! I'm the local inner class");
        System.out.println(
          "The value of the data member of the outer class is : " + value
        );
      }
    }

    InnerClass innerClass = new InnerClass();
    innerClass.printValue();
  }

  public static void main(String[] args) {
    LocalInnerClass localInnerClass = new LocalInnerClass();
    localInnerClass.showLocalInnerClass();
  }
}
