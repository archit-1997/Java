package com.github.generics.classes;

public class GenericClass<T> {

  //generic data member
  T dataMember;

  //generic setter method
  void add(T dataMember) {
    this.dataMember = dataMember;
  }

  //generic getter method
  T get() {
    return dataMember;
  }
}
