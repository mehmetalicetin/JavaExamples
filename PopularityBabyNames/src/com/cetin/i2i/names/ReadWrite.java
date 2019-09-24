package com.cetin.i2i.names;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.cetin.i2i.file.operation.FileWriterandReaderOperation;
import com.cetin.io.streams2.FileProcess;

public class ReadWrite  implements IFileOperation{
  
  /**
   * @param file
   * @param destPath
   * @throws IOException
   */
  public void writeFile(File file, String destPath, String text) throws IOException {
    file = FileProcess.createNewFile(destPath, "");
    FileWriterandReaderOperation.writeFile(file, text);
  }
  
  /**
   *@param file
   *@return
   */
  public Map<String, Integer> read(File file) throws IOException {
    Map<String, Integer> map = new HashMap<String, Integer>();
    String builder = FileWriterandReaderOperation.getStringBuilderFromReadFile(file);
    //String[] list = builder.toString().split(",");
    String[] list = builder.split(System.getProperty("line.separator"));
    for (int i = 0; i < list.length; i++) {
      String string = list[i];
      if (map.containsKey(string)) {
        int count = map.get(string);
        map.replace(string, ++count);
      } else {
        map.put(string, 1);
      }
    }

    return map;

  }

}
