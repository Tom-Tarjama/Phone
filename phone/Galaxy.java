package com.codingdojo.phone;

public class Galaxy extends Phone implements Ringable{
	
	public Galaxy() {};
	
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
    	System.out.println("Ringing Galaxy");
    	return "Galaxy says: "+this.getRingTone();
    }
    
    @Override
    public String unlock(String action) {
    	System.out.println("Unlocking Galaxy");
    	return "Galaxy has been unlocked via "+action;
    }
    
    @Override
    public void displayInfo() {
    	System.out.println("Version: "+this.getVersionNumber());
    	System.out.println("Battery Percentage: "+this.getBatteryPercentage());
    	System.out.println("Carrier: "+this.getCarrier());
    	System.out.println("Ringtone: "+this.getRingTone());
    }

}
