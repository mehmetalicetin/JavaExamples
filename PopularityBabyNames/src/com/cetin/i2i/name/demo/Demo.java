package com.cetin.i2i.name.demo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.cetin.i2i.names.Arragement;
import com.cetin.i2i.names.IFileOperation;
import com.cetin.i2i.names.ReadWrite;

public class Demo {

  public static final String SOURCEPATH = "C:\\Users\\7767\\eclipse-workspace\\PopularityBabyNames\\babynames.txt";
  public static final String DESTPATH = "C:\\Users\\7767\\eclipse-workspace\\PopularityBabyNames\\babynamesResult.txt";

  public static void main(String[] args) throws IOException {
    

    Map<String, Integer> map = new HashMap<String, Integer>();
    File file = new File(SOURCEPATH, "");
    String text = "";
    String[]resultText;
    
    
    IFileOperation fileOperation=new ReadWrite();
    
    map = fileOperation.read(file);
    
    text = getTextLastModified(map, text);
    
    fileOperation.writeFile(file, DESTPATH, text);
  }

  /**
   * @param map
   * @param operation
   * @param text
   * @return
   */
  private static String getTextLastModified(Map<String, Integer> map,String text) {
    String[] resultText;
    Arragement arragement=new Arragement();
    map = arragement.sortByValue(map);
    resultText= arragement.arrangamentSpaceForList(arragement.getMapPrintForFeatures(map));
    
    text="  Name      Count Percentage\n";
    for (String str : resultText) {
      text+=str+"\n";
    }
    return text;
  }

}
