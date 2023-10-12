

import java.util.UUID;

public class BMW_i4 extends BMW implements ElectricCarDetails {
	
	
	public BMW_i4 () {
		productID = UUID.randomUUID();
	}
	
	@Override
	public void printCarModelName() {
		System.out.println("Model: BMW  i4");	
	}

	@Override
	public String getFuelType() {
		return "electric";
	}

	@Override
	public void printRatedVoltage() {
		System.out.println("400V");
		
	}

	@Override
	void printProductID() {
		System.out.println("ProductID: "+productID);
		
	}

}
