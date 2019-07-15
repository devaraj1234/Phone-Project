package com.phone;


public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}
	
	public String ring() {
		return this.getClass().getSimpleName() + " " + this.getVersionNumber() + " Says " + this.getRingTone();
	}
	
	public String unlock() {
		return "Unlocking via facial recognition";
	}
	
	public void displayInfo() {
		System.out.println(this.getClass().getSimpleName() + " " + this.getVersionNumber() + " from " + this.getCarrier());
	}

}