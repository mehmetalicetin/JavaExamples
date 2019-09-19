package com.cetin.i2i.names;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Operation {

  /**
   * @param map
   * @return
   */
  public int getTotalCount(Map<String, Integer> map) {
    int total = 0;
    for (Entry<String, Integer> a : map.entrySet()) {
      total += a.getValue();
    }
    return total;
  }

  /**
   * @param unsortMap
   * @return
   */
  public Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

    // 1. Convert Map to List of Map
    List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

    // 2. Sort list with Collections.sort(), provide a custom Comparator
    //    Try switch the o1 o2 position for a different order
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return (o2.getValue()).compareTo(o1.getValue());
      }
    });

    // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
    Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
    for (Map.Entry<String, Integer> entry : list) {
      sortedMap.put(entry.getKey(), entry.getValue());
    }
    return sortedMap;
  }

 

  /**
   * @param value
   * @param totalCount
   * @return
   */
  protected static double getOran(Integer value, int totalCount) {
    return 100 * value / totalCount;
  }
  
  public String addSpace(String src, int gap) {
    for (int i = 0; i < gap; i++) {
      src += " ";
    }
    return src;
  }
  
  /**
   * @param row
   * @param maxLength
   */
  protected int getMaxLength(List<String> column, int maxLength) {
    for (String str : column) {
      int len = str.length();
      if (maxLength < len) {
        maxLength = len;
      }
    }
    return maxLength;
  }


}
