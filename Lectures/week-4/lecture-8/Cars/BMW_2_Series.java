

import java.util.UUID;

public class BMW_2_Series extends BMW implements PetrolCarDetails{
    
	public BMW_2_Series () {
		productID = UUID.randomUUID();
	}

	@Override
	public String getFuelType() {
		// TODO Auto-generated method stub
		return "petrol";
	}

	@Override
	public void printCarModelName() {
		System.out.println("Model: BMW 2 Series");
		
	}

	@Override
	void printProductID() {
		System.out.println("ProductID: "+productID);
		
	}

	@Override
	public void printCompressionRatio() {
		System.out.println("14");
		
	}

}
