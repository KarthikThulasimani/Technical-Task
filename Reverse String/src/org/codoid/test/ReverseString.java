//2.How do we reverse a string?
package org.codoid.test;
public class ReverseString {
	public static void main(String[] args) {
		String s="i am karthik";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
