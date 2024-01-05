package technartsHomework.customer;

import java.util.List;

import technartsHomework.car.Car;
import technartsHomework.car.Hatchback;

public class IndividualCustomer extends Customer{
	
	private String firstName;
	private String lastName;
	
    public IndividualCustomer(String firstName, String lastName, String email, String phone) {
		super( email, phone);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public void rentalService(Car car) {
		if(car instanceof Hatchback) {
			if(car.getOwner() == null) {
				car.setOwner(firstName+" "+lastName);
		}
				System.out.println(firstName+" "+lastName+" rented car name: "+ car.getModel());	
		}else {
			System.out.println("Individuals can only rent hatchback car");
		}
		
	}


	@Override
	public void getAvilableCars(List<Car> carList) {
		for(Car car: carList) {
			if(car.getOwner() ==null) {
				
				if (car instanceof Hatchback) {
				    Hatchback hatchback = (Hatchback) car;
				    System.out.println("Car model: "+hatchback.getModel() + ", Daily Fee: " + hatchback.getDailyRentalFee() + ", Monthly Fee: " + hatchback.getMonthlyRentalFee());
				}
			}
		}
				
	}
	
}
