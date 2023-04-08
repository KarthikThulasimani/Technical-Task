//9.How to read a file in Java?
package org.codoid.test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Doc\\test.txt");
	    List<String> readLines = FileUtils.readLines(f);
		for (String s : readLines) {
			System.out.println(s);
		}
		
		boolean canRead = f.canRead();
		System.out.println(canRead);
	    }
       }



