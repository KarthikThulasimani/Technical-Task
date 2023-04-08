//26.Write a Java Program to print the below output: * 1 * 12 * 123 * 1234 * 12345 * 123456 * 1234567
package org.codoid.test;
public class PatternPrinting {
	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			System.out.print("*");
	    for (int j = 1; j <=i; j++) {
	    	System.out.print(j);
				
		}
	   }
	}
}
