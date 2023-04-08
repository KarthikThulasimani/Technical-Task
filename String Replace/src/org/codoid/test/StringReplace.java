//70.How to replace string with another string in java Program
package org.codoid.test;
public class StringReplace {
	public static void main(String[] args) {
		String s="lion jumps over the lazy dog";
		System.out.println("Without replace String :"+s);
		System.out.println("With replace String    :"+ s.replace("lion", "cat"));
	}
}
