package com.cetin.i2i.file.operation;

import java.io.File;
import java.io.IOException;

/**
 * @author cetin
 *
 */
public class FilterOperation {

  public static boolean accept(File file, String fileName)throws IOException {
    File f = new File(file, fileName);

    if (f.isFile() && fileName.toLowerCase().endsWith(".txt"))
      return true;
    else
      return false;
  }

}
