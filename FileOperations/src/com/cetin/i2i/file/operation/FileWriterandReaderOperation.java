package com.cetin.i2i.file.operation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileWriterandReaderOperation {

  public static void writeFile(File file) throws IOException {
    Writer writer = null;

    try {
      System.out.println("File Writer - start");
      writer = new FileWriter(file);
      writer.write("it is so sunny today that i like that !!!");

      writer.append(System.getProperty("line.seperator"));
    } catch (IOException e) {
      System.err.println("Cannot create file ");
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException e2) {
          System.err.println("Cannot closed the file " + file);
        }
      }
    }
    System.out.println("File Writer - end");
  }

  public static void readFile(File file) throws IOException{
    Reader reader = null;

    try {
      reader = new FileReader(file);
      System.out.println("File Reader - start");
      int count;
      while ((count = reader.read()) != -1) {
        System.out.println((char)count);
      }

    } catch (IOException e) {
      System.err.println("Cannot create file ");
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e2) {
          System.err.println("Cannot closed the file " + file);
        }
      }
    }
    System.out.println("File Reader - end");
  }

}
