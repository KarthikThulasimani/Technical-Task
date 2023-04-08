//41.swap two numbers without using temporary variable
package org.codoid.test;
public class Swapping {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=0;
		System.out.println("Before Swapping a="+a);
		System.out.println("Before Swapping b="+b);
		System.out.println();
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping a="+a);
		System.out.println("After Swapping b="+b);
		}
    }
