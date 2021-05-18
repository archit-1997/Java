package com.github.lambdas;

public class Greeter {

  public static void main(String[] args) {
    Greeter greeter = new Greeter();

    //notice that the object is of type Action (Interface)
    Action actionImplementation = new ActionImplementation();

    //passing object of the implementation class of the interface
    //this method can now do anything according to the implementation class
    greeter.greet(actionImplementation);

    //lambda expression of type Action (Interface)
    Action performLambda = () ->
      System.out.println("Im the perform lambda of the action class");

    performLambda.perform();
  }

  //here I'm passing a behaviour to the greet method --- NO
  //here I'm actually passing a thing that has a behaviour
  //takes in an object of type interface
  private void greet(Action action) {
    action.perform();
  }
}
