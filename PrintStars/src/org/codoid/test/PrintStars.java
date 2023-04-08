//24.Write a Java program to print stars using for loop, where the number of stars printed should be equal to the row number?
package org.codoid.test;
public class PrintStars {
	public static void main(String[] args) {
		int numRows = 10; 
	    
	    for (int i = 1; i <= numRows; i++) { 
	      for (int j = 1; j <= i; j++) { 
	        System.out.print("*"); 
	      }
	      System.out.println(); 
	    }
	  }
	}
	