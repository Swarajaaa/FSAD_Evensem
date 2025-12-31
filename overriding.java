package com.maven;
class bank{
	public double interest() {
		return 0.0;
	}
}
class SBI extends bank{
	public double interest() {
		return 5.5;
	}
}
class HDFC extends bank {
    public double interest() {
        return 6.25;
    }
}
public class overriding {
	public static void main(String[] args) {

        bank b1 =  new SBI();
        System.out.println("SBI interest rate - " + b1.interest() + "%");

        bank b2 = new HDFC();
        System.out.println("HDFC interest rate - " + b2.interest() + "%");
    }

}



