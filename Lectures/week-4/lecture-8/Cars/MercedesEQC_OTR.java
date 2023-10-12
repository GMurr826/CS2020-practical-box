

import java.util.UUID;

public class MercedesEQC_OTR extends Mercedes implements ElectricCarDetails  {
	public MercedesEQC_OTR () {
		productID = UUID.randomUUID();
	}
	
	@Override
	public void printCarModelName() {
		System.out.println("Model:Mercedes EQC OTR");	
	}

	@Override
	public String getFuelType() {
		return "electric";
	}

	@Override
	public void printRatedVoltage() {
		System.out.println("800V");
		
	}

	@Override
	void printProductID() {
		System.out.println("ProductID: "+productID);
		
	}

	
}
