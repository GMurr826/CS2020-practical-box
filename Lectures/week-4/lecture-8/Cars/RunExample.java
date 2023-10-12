

public class RunExample {

	public static void main(String[] args) {
		
		
		
		Car i4 = new BMW_i4 ();
		printlDetails (i4);
		System.out.println("-----------------");
		
		Car series2 = new BMW_2_Series();
		printlDetails (series2);
		System.out.println("-----------------");
		
		Car c180 = new MercedesC180();
		printlDetails (c180);
		System.out.println("-----------------");
		
		Car eqc = new MercedesEQC_OTR();
		printlDetails (eqc);
		System.out.println("-----------------");

	}
	
	private static void printlDetails (Car car) {
		
		car.printCarModelName();
		
        car.printProductID();
		
		car.printCarManufacturerAddress();
		System.out.println(car.getFuelType());
		
		if (car.getFuelType().equals("electric")) {
			 ((ElectricCarDetails) car).printRatedVoltage();		
			}
			
			if (car.getFuelType().equals("petrol")) {
				 ((PetrolCarDetails) car).printCompressionRatio();;		
			}
		
	}

}
