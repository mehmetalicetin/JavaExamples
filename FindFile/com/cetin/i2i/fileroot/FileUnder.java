/**
 * 
 */
package com.cetin.i2i.fileroot;

import java.io.File;

/**
 * A class to provide display all file endWith any extension.
 * 
 * @author mehmetali.cetin
 *
 */
public class FileUnder {

	public static final String SRC_PATH = "./";

	public static File[] children; // the array has got file list as given under src_path.

	public static void main(String[] args) {
		File fileStartingDirectory = new File(SRC_PATH);
		fileFinder(fileStartingDirectory);
		find(".java");
	}

	/**
	 * Constructs a file finder for a given directory tree.
	 * 
	 * @param startingDirectory the starting directory of the tree
	 */
	public static void fileFinder(File startingDirectory) {
		children = startingDirectory.listFiles(); // get all files under startingDirectory
	}

	/**
	 * This method is found all file under src_path with end of the related extension.
	 * @param extension
	 */
	public static void find(String extension) {
		for (File child : children) {
			String filePath = child.toString();
			//recursion if child is a directory.
			if (child.isDirectory()) {
				fileFinder(child);  // children has been under the child files.
				find(extension);   // it's recursion
			} else if (filePath.endsWith(extension)) {
				System.out.println("File :" + filePath);
			}
			
		}
	}

}
