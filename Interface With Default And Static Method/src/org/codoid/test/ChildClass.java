package org.codoid.test;
public class ChildClass implements MyInterface {

	@Override
	public void empName() {
		System.out.println("Employee Name:KARTHIK");
	}
	 public static void main(String[] args) {
	   ChildClass c=new ChildClass();
	    c.empName();
	    c.empId();
	    MyInterface.empPhno();
    }
  }
