package technartsHomework.customer;

import java.util.List;

import technartsHomework.car.Car;
import technartsHomework.car.Hatchback;
import technartsHomework.car.Sedan;

public class CorporateCustomer extends Customer  {

	private String companyName;
	
    public CorporateCustomer( String email, String phone,String companyName) {
		super(email, phone);
		this.companyName = companyName;

	}

	public String getCompanyName() {
		return companyName;
	}

	@Override
	public void rentalService(Car car) {
		if(car.getOwner() == null) {
				car.setOwner(companyName);
		}
		System.out.println(companyName+" company rented car name: "+ car.getModel());	
	}

	@Override
	public void getAvilableCars(List<Car> carList) {
		
		for(Car car: carList) {
			if(car.getOwner() ==null) {
				
				if (car instanceof Hatchback) {
				    Hatchback hatchback = (Hatchback) car;
				    System.out.println("Car model: "+hatchback.getModel() + ", Daily Fee: " + hatchback.getDailyRentalFee() + ", Monthly Fee: " + hatchback.getMonthlyRentalFee());
				} else if (car instanceof Sedan) {
				    Sedan sedan = (Sedan) car;
				    System.out.println("Car model: "+ sedan.getModel() + ", Daily Fee: " + sedan.getDailyRentalFee() + ", Monthly Fee: " + sedan.getMonthlyRentalFee());
				}else {
					System.out.println("Car model: "+ car.getModel() + ", Daily Fee: " + car.getDailyRentalFee() );
				}
				
				}
		}
		
	}
}