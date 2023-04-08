//8.Write a program to demonstrate the method overloading by changing a number of arguments?
package org.codoid.test;
public class MethodOverloadingArguments {
	private void bankDetails(String name) {
	    System.out.println("Bank Name:"+name);
	    }
	    private void bankDetails(String address,int pincode) {
			System.out.println("Bank Address:"+address);
			System.out.println("Pincode:"+pincode);
		}
	    private void bankDetails(long accNo,String name1) {
			System.out.println("Account Number:"+accNo);
			System.out.println("Account Holder Name:"+name1);

		}
	    private void bankDetails(float bal,long phNo) {
			System.out.println("Account Balance:"+bal);
			System.out.println("Phone Number"+phNo);

		}
	    public static void main(String[] args) {
	    	MethodOverloadingArguments b=new MethodOverloadingArguments();
	    	    b.bankDetails("Indian Bank");
	    	    b.bankDetails("25,Chennai", 600097);
	    	    b.bankDetails(1234567890l, "KARTHIK T");
	    	    b.bankDetails(2500.00f, 8526862335l);
		    }
	       }



