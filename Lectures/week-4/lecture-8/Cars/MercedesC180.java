

import java.util.UUID;

public class MercedesC180  extends Mercedes implements PetrolCarDetails{
	   
		public MercedesC180 () {
			productID = UUID.randomUUID();
		}

		@Override
		public String getFuelType() {
			// TODO Auto-generated method stub
			return "petrol";
		}

		@Override
		public void printCarModelName() {
			System.out.println("Model: Mercedes 180");
			
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
