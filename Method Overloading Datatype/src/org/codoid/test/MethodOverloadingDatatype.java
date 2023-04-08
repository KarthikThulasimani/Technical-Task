//7.Write a program to demonstrate the method overloading by changing data types?
package org.codoid.test;
public class MethodOverloadingDatatype {
	   private void studentDetails(String name) {
			System.out.println("Student Name:"+ name);
		    }
		   private void studentDetails(int regNo) {
			System.out.println("Student RegNo:"+ regNo);
		    }
		   private void studentDetails(char gender) {
		    System.out.println("Student Gender:"+ gender);
		    }
		   private void studentDetails(float height) {
		    System.out.println("Student Height:"+ height);
		    }
		   private void studentDetails(long phNo) {
			 System.out.println("Student PhNO:"+ phNo);
		    }
		   public static void main(String[] args) {
			   MethodOverloadingDatatype c=new MethodOverloadingDatatype();
		             c.studentDetails("Karthik T");
		             c.studentDetails(123456);
		             c.studentDetails('M');
		             c.studentDetails(5.5f);
		             c.studentDetails(8667070292l); 
		   } 
		}



