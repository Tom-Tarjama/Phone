package com.codingdojo.phone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone a = new IPhone();
		a.setBatteryPercentage(99);
		a.setCarrier("Verizon");
		a.setRingTone("ALarm");
		a.setVersionNumber("X");
		a.displayInfo();
		a.ring();
		System.out.println(a.ring());
		a.unlock("finger print");
		System.out.println(a.unlock("finger print"));
		
		Galaxy b = new Galaxy("S9", 50, "SPrint", "Beep");
		b.displayInfo();
		System.out.println(b.unlock("facial recognition"));
		System.out.println(b.ring());
		
		
		
	}

}
