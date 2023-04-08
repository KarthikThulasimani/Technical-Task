//53.Write a Java Program to find whether a string or number is palindrome or not.
package org.codoid.test;
public class Palindrome {
	public static void main(String[] args) {
		String s="RACECAR";
		String r="";
	for (int i = s.length()-1; i >=0; i--) {
		r=r+s.charAt(i);
		}
	if (s.equals(r)) {
		System.out.println("Given String is a Palindrome");
		
	} else {
		System.out.println("Given String is Not a palindrome");

	}
	}
	}
