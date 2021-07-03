package com.github.archit.nestedclasses.nestedinterface.withininterface;

public interface NestedInterfaceWithinInterface {
  void show();

  //the nested interface cannot be private
  public interface NestedInterface {
    void msg();
  }
}
