//19.Write Java program that checks if two arrays contain the same elements.
package org.codoid.test;
import java.util.Arrays;
public class ArrayComparison {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int a1[]= {7,6,3,1,5,2,4};
		
		Arrays.sort(a);
		Arrays.sort(a1);
		boolean equals = Arrays.equals(a, a1);
		if (equals) {
			System.out.println("The Two Arrays Contains Same Element.");
		} else {
            System.out.println("The Two Arrays Do Not Contains  Same Element.");
		}
	}
 }


