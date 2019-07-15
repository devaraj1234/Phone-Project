package com.phone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy S9 = new Galaxy("S9", 63, "Verizon", "Ring Ring Ring!");
        IPhone x = new IPhone("X", 100, "AT&T", "Zing");

        S9.displayInfo();
        System.out.println(S9.ring());
        System.out.println(S9.unlock());

        x.displayInfo();
        System.out.println(x.ring());
        System.out.println(x.unlock());
    }
}