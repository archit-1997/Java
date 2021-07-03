package com.github.archit.lambdas;

public class ActionImplementation implements Action {

  @Override
  public void perform() {
    System.out.println("I can perform any action that has been given to me");
  }
}
