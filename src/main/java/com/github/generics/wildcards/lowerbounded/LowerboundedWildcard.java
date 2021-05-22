package com.github.generics.wildcards.lowerbounded;

import java.util.List;

public class LowerboundedWildcard {

  public void display(List<? super Integer> list) {
    for (Object o : list) {
      System.out.println(o);
    }
  }
}
