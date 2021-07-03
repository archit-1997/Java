package com.github.archit.generics.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapWithGenerics {
  /*
  public static void main(String[] args) {
    Map<Integer, String> stringMap = new HashMap<>();
    stringMap.put(1, "Java");
    stringMap.put(2, "Generics");

    //NOTE : we can't directly iterate over a map

    //converting map to set using map.entrySet
    Set<Map.Entry<Integer, String>> st = stringMap.entrySet();

    //iterator for set
    Iterator<Map.Entry<Integer, String>> it = st.iterator();

    while (it.hasNext()) {
      //extracting one entry from the set
      Map.Entry e = it.next();
      System.out.println(e.getKey() + " " + e.getValue());
    }
  }

   */
}
