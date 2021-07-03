package com.github.archit.nestedclasses.innerclass.memberinnerclass;

public class MemberInnerClass {

  private int privateField = 20;

  class Inner {

    //accessing the private member of the outer class
    void printMessage() {
      System.out.println(
        "Value of the private field of the outer class : " + privateField
      );
    }
  }
  /*
  public static void main(String[] args) {
    //instance of the outer class
    MemberInnerClass outerClass = new MemberInnerClass();

    MemberInnerClass.Inner innerClass = outerClass.new Inner();

    innerClass.printMessage();
  }

   */
}
