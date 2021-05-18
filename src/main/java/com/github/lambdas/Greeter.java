package com.github.lambdas;

public class Greeter {

  public static void main(String[] args) {
    Greeter greeter = new Greeter();

    //notice that the object is of type Action (Interface)
    Action actionImplementation = new ActionImplementation();

    //using inner class to avoid an implementation of the action interface
    Action actionImplementationInnerClass = new Action() {
      @Override
      public void perform() {
        System.out.println(
          "Im the perform method inside an anonymous inner class"
        );
      }
    };

    actionImplementationInnerClass.perform();

    //lambda expression of type Action (Interface)
    Action performLambda = () ->
      System.out.println("Im the perform lambda of the action class");

    performLambda.perform();

    //passing object of the implementation class of the interface
    //this method can now do anything according to the implementation class
    greeter.greet(actionImplementation);
    //NOTE : both the statements mean the same as above. Just different ways of writing the same thing
    //greeter.greet(performLambda);
    //greeter.greet(actionImplementationInnerClass);
  }

  //here I'm passing a behaviour to the greet method --- NO
  //here I'm actually passing a thing that has a behaviour
  //takes in an object of type interface
  //can also take a lambda or instance of inner class. It actually doesn't care what it receives
  private void greet(Action action) {
    action.perform();
  }
}
