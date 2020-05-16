package com.cetin.i2i.file.operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author cetin
 *
 */
public class CopyOperation {

  /**
   * @param pathIn
   * @param pathOut
   * @return
   * @throws IOException
   */
  public static FileOutputStream fileOutputStreamforText(String sourcePath,String destPath) throws IOException {

    FileInputStream fin = null;
    FileOutputStream fout = null;
    int i = 0;

    try {
      fin = new FileInputStream(sourcePath);
    } catch (FileNotFoundException e) {
      System.err.println("text.txt file not found !!");
    }

    try {
      fout = new FileOutputStream(destPath);
    } catch (FileNotFoundException e1) {
      System.err.println("fileout.txt file not found !!");
    }
    try {
      copyFile2(fin, fout); 
    } catch (Exception e) {
      System.err.println("Failed file copy operation  !!");
    }
    finally {
      fin.close();
      fout.close();
    }
   
    
    return fout;
  }

  /**
   * @param fin
   * @param fout
   * @throws IOException
   */
  private static void copyFile(FileInputStream fin, FileOutputStream fout) throws IOException {
    int i;
    try {
      while (true) {
        i = fin.read();
        if (i != -1) {
          fout.write(i);
        }else {
          break;
        }
      }
      
    } catch (ArrayIndexOutOfBoundsException e2) {
      System.err.println("An error occur as file writing fileout.txt");
    }
  }
  
  
  /**
   * @param fin
   * @param fout
   * @throws IOException
   */
  private static void copyFile2(FileInputStream fin, FileOutputStream fout) throws IOException {
    
    byte[]memory=new byte[0xFFFF];
    for(int length=0 ; (length=fin.read(memory)) != -1; ) {
      fout.write(memory,0,length);
    }
    
  }
  
}
