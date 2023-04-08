//4.Write a Program to remove duplicates in an ArrayList.
package org.codoid.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(200);
		l.add(400);
		
		System.out.println("Before Removing Duplicates:"+l);
		
		Set<Integer> s=new HashSet<>();
		s.addAll(l);
		
		System.out.println("After Removing Duplicates:"+s);
  }
}