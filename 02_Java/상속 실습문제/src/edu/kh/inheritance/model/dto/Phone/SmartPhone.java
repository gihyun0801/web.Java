package edu.kh.inheritance.model.dto.Phone;

public class SmartPhone extends Phone{
   
	private String operatingSystem;// OS;
	private int storageCapacity; // 스토리지 공간 크기
	
	public SmartPhone() {
		
	}
	
	
	public SmartPhone(String brand, String model, int year,
			int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
	
	@Override
	public void printInfo() {
	    super.printInfo();
	    
	    System.out.println(getOperatingSystem());
	    System.out.println(getStorageCapacity());
	 
		
		
		
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	
	
	
}
