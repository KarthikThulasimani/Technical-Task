//55.Iterate the LinkedHashMap values
package org.codoid.test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Iteration {
	public static void main(String[] args) {
		Map<Integer, String> l = new LinkedHashMap<>();
		l.put(10, "Karthik");
		l.put(20, "Thulasimani");
		l.put(30, "Vijay");
		
		Set<Entry<Integer, String>> entrySet = l.entrySet();
		for (Entry<Integer, String> e : entrySet) {
			System.out.println(e.getValue());
		}
	}
}
