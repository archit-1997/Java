package com.github.generics.wildcards.upperbounded;

import java.util.ArrayList;
import java.util.List;

public class ShapeImplementation {

  //wildcard ? allows the list to take any instance which a child of shape class
  private void printShapeName(List<? extends Shape> list) {
    for (Shape s : list) s.draw();
  }

  public static void main(String[] args) {
    ShapeImplementation shapeImplementation = new ShapeImplementation();
    Rectangle rectangle = new Rectangle();

    Circle circle = new Circle();

    List<Shape> list = new ArrayList<>();
    list.add(circle);
    list.add(rectangle);

    shapeImplementation.printShapeName(list);
  }
}
