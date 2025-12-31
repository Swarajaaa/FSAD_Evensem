package com.maven;

class Vehicle{
	public void print() {
		System.out.println("This is a vehicle");
	}
	
}

class car extends Vehicle{
	void drive() {
		System.out.println("the car is being driven");

	}
	
}
class Electriccar extends car{
	void charge() {
		System.out.println("the car is charging");
	}
}
public class maven {
	public static void main(String args[]) {
		Electriccar tesla = new Electriccar();

       
        tesla.print();   
        tesla.charge();  
        tesla.drive();
		
		
	}

}
