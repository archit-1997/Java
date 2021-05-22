package com.github.generics.wildcards.unbounded;

import java.util.List;

public class UnboundedWildcard {

  public void display(List<?> list) {
    for (Object o : list) {
      System.out.println(o);
    }
  }
}
