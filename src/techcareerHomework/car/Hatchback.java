package techcareerHomework.car;

public class Hatchback extends Car{

	public Hatchback(String model, String color, int trunkCapacity, String fuelType, double dailyRentalFee) {
		super(model, color, trunkCapacity, fuelType, dailyRentalFee);
	}
	
	public double getMonthlyRentalFee() {
		return super.getDailyRentalFee()*30*80/100;
	}
}