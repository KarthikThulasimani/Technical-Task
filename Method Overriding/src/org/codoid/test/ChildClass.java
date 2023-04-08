package org.codoid.test;
public class ChildClass extends ParentClass {
	@Override
	public void karthikRank() {
		System.out.println("Karthik Rank: 1st");
	}
	 private void ajithRank() {
			System.out.println("Ajith Rank: 3rd");
	 }
	 
	 public static void main(String[] args) {
		 ChildClass s=new ChildClass();
		 s.karthikRank();
		 s.vijayRank();
		 s.ajithRank();
	 }
}
