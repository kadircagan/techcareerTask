package technartsHomework.car;

public class Car {
	private String model;
    private String color;
    private int trunkCapacity;
    private String fuelType;
    private double dailyRentalFee;
    private String owner;
    
    public Car(String model, String color, int trunkCapacity, String fuelType, double dailyRentalFee) {
		super();
		this.model = model;
		this.color = color;
		this.trunkCapacity = trunkCapacity;
		this.fuelType = fuelType;
		this.dailyRentalFee = dailyRentalFee;
	}
    
    public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTrunkCapacity() {
		return trunkCapacity;
	}
	public void setTrunkCapacity(int trunkCapacity) {
		this.trunkCapacity = trunkCapacity;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getDailyRentalFee() {
		return dailyRentalFee;
	}
	public void setDailyRentalFee(double dailyRentalFee) {
		this.dailyRentalFee = dailyRentalFee;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}



}
