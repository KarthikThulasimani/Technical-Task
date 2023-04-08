package org.codoid.test;
public class Details extends PersonalInfo{

	@Override
	void name() {
		System.out.println("Dhanish");
		
	}

	@Override
	void phoneNo() {
		System.out.println("12345678");
		
	}

	@Override
	void address() {
		System.out.println("25,chennai-6380097");
		
	}

	@Override
	void email() {
		System.out.println("kyg@gmail.com");
		
	}
	public static void main(String[] args) {
		Details d=new Details();
		d.name();
		d.phoneNo();
		d.address();
		d.email();
	}

}
