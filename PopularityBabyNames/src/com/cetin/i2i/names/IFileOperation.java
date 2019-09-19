package com.cetin.i2i.names;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public interface IFileOperation {
  

  public static final String SEPERATOR = "|";
  
  public static final int PARAMETERCOUNT=3;

  public Map<String,Integer> read(File file) throws IOException;
  
  public void writeFile(File file, String destPath, String text) throws IOException; 
}
