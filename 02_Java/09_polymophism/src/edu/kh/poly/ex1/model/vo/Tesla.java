package edu.kh.poly.ex1.model.vo;

public class Tesla extends Car{ // 전기차
      
	private int batteryCapacity; //배터리 용량
	
	public Tesla() {} //기본 생성자

	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
	}
	
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	
	
	
	
	
}
