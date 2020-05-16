package com.cetin.i2i.names;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Arragement extends Operation{
  
 

  public String[] arrangamentSpaceForList(Map<Integer, String> listResultBaby) {

    List<String> column = new ArrayList<String>();
    List<String> existColumn = new ArrayList<String>();
    String[] res = new String[IFileOperation.PARAMETERCOUNT];

    for (int i = 0; i < res.length; i++) {
      res[i] = "";
    }

    for (int i = 0; i < IFileOperation.PARAMETERCOUNT; i++) {
      column.clear();
     
      getRowStepByStep(listResultBaby, column, i);

      int maxLength = 0;
      maxLength = getMaxLength(column, maxLength);

      existColumn = getRowFixStepByStep(column, i, maxLength);
      if (!existColumn.isEmpty()) {
        column = existColumn;
      }

      for (String string : column) { 
          for (int j = 0; j < res.length; j++) {
            res[j] += "  " + column.get(j);
          }
          
        break;
      }


    }

    return res;

  }

  
  /**
   * @param listResultBaby
   * @param row
   */
  private void getRowStepByStep(Map<Integer, String> listResultBaby, List<String> column, int index) {
    for (Entry<Integer, String> e : listResultBaby.entrySet()) {
      String[] rowStep = e.getValue().split("\\|");
      column.add(rowStep[index]);
    }

  }

  /**
   * @param listResultBaby
   * @param row
   * @param index
   * @param maxLength
   */
  private List<String> getRowFixStepByStep(List<String> column, int index, int maxLength) {
    List<String> newColumn = new ArrayList<String>();
    for (String str : column) {
      if (maxLength >= (str.length())) {
        str = addSpace(str, (maxLength - (str.length())));
        newColumn.add(str);
      }
    }
    return newColumn;
  }

  

  /**
   * @param map
   * @return 
   */
  public Map<Integer, String> getMapPrintForFeatures(Map<String, Integer> map) {
    Map<Integer, String> mapPrint = new HashMap<Integer, String>();
    int totalCount = getTotalCount(map);
    int count = 1;
    
    for (Entry<String, Integer> entry : map.entrySet()) {
      double oran = getOran(entry.getValue(), totalCount);
      mapPrint.put(count,entry.getKey() + IFileOperation.SEPERATOR + entry.getValue() + IFileOperation.SEPERATOR + oran);
      count++;
    }

    return mapPrint;
  }
}
