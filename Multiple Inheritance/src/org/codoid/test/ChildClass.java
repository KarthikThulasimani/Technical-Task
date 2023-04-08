//29.Implement multiple inheritances using an interface
package org.codoid.test;
public class ChildClass implements ParentClass1,ParentClass2 {

	@Override
	public void test3() {
		System.out.println("3");
	}

	@Override
	public void test4() {
		System.out.println("4");
		
	}

	@Override
	public void test1() {
		System.out.println("1");
		
	}

	@Override
	public void test2() {
		System.out.println("2");
		
	}
 public static void main(String[] args) {
	 ChildClass c=new ChildClass();
	 c.test1();
	 c.test2();
	 c.test3();
	 c.test4();
}
}
