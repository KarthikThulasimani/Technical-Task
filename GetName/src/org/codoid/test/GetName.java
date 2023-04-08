//10.What is GetName in java with example?
package org.codoid.test;
import java.io.File;
import java.io.IOException;
public class GetName {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Doc\\test.txt");
	    String name = f.getName();
	    System.out.println(name);
	    }
	  }
	


