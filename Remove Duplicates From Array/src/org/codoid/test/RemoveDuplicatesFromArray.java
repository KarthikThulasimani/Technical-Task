//15.How to remove duplicate elements from an array in Java?
package org.codoid.test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		String[] s= {"Karthik","Vijay","Ajith","Vijay","Surya"};
		System.out.println("Array With Duplicate:"+Arrays.toString(s));
		
		Set<String> n=new HashSet<>(Arrays.asList(s));
		String[] array = n.toArray(new String[0]);
		System.out.println("Array Without Duplicate"+Arrays.toString(array));
		}
    }


